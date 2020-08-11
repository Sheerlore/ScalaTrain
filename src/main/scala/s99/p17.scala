package s99

//リストを２つの部分に分割する
//最初の部分のリストの長さが与えられる、結果にはタプルを用いる
object p17 extends App{

  def splitBuiltin[T](n: Int, list: List[T]): (List[T], List[T]) = list.splitAt(n)

  def splitRecursive[T](n: Int, list: List[T]): (List[T], List[T]) = (n, list) match {
    case (n, Nil) => (Nil, Nil)
    case (0, list) => (Nil, list)
    case (n, h :: tail) => {
      val (pre, post) = splitRecursive(n - 1, tail)
      (h :: pre, post)
    }
  }

  def splitFunctinal[T](n: Int, list: List[T]): (List[T], List[T]) = {
    (list.take(n), list.drop(n))
  }


  val list: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l, 'm, 'n)
  println(splitBuiltin(3, list))
}
