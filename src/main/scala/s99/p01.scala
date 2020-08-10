package s99


// リストの末尾の要素を検索する
object p01 extends App{
  def last[T](list: List[T]): T = list match {
    case x :: Nil => x
    case _ :: tail  => last(tail)
    case _        => throw new NoSuchElementException
  }

  def lastBuiltin[T](list: List[T]): T = list.last

  val list: List[Int] = List(1, 1, 2, 3, 5, 8)
  println(last(list))
}
