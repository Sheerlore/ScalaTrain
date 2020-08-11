package s99

//リスト要素の連続した重複を排除する
//リストに繰り返しの要素が含まれている場合は、要素の単一のコピーに置き換える必要がある。要素の順序は変更しない
object p08 extends App {
  def compressRecursive[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case h :: tail => h :: compressRecursive(tail.dropWhile(_ == h))
  }

  def compressTailRecursive[T](list: List[T]): List[T] = {
    def compressR(result: List[T], curList: List[T]): List[T] = curList match {
      case h :: tail => compressR(h :: result, tail.dropWhile(_ == h))
      case Nil => result.reverse
    }
    compressR(Nil, list)
  }

  def compressFucntion[T](list: List[T]): List[T] = {
    list.foldRight(List[T]()) { (h, r) =>
      if(r.isEmpty || r.head != h) h :: r
      else r
    }
  }
  val list: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(compressRecursive(list))
  println(compressFucntion(list))
  println(compressTailRecursive(list))


}
