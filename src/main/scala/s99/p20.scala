package s99

//K番目の要素をリストから削除する
//リストと削除した要素を組として返す、要素には0から番号がつく
object p20 extends App{

  def removeAt[T](n: Int, list: List[T]): (List[T], T) = list.splitAt(n) match {
    case (Nil, _ ) if n < 0 => throw new NoSuchElementException
    case (pre, e :: post) => (pre ::: post, e)
    case (pre, Nil)  => throw new NoSuchElementException
  }

  def removeAt2[T](n: Int, list: List[T]): (List[T], T) = {
    if (n < 0) throw new NoSuchElementException
    else (n, list) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, h :: tail) => (tail, h)
      case (_, h :: tail) =>
        val (t, e) = removeAt(n - 1, list.tail)
        (list.head :: t, e)
    }
  }

  val list: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l, 'm, 'n)
  println(removeAt(3, list))
  println(removeAt2(3, list))
  //println(removeAt(4, List[Symbol]()))

}
