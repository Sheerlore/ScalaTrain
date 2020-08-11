package s99

//要素を指定したリスト内の位置に挿入する
object p21 extends App{
  def insertAt[T](e: T, n: Int, list: List[T]): List[T] = list.splitAt(n) match {
    case (pre, post) => pre ::: e :: post
  }

  def insertAt2[T](e: T, n: Int, list: List[T]): List[T] = list match {
    case x if n == 0 => e :: x
    case x :: tail if n > 0 => x :: insertAt2(e, n - 1, tail)
    case _ => throw new NoSuchElementException
  }

  val list: List[Symbol] = List('a, 'b, 'c,'d, 'e)
  println(insertAt('f, 2, list))

}
