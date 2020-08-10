package s99


//リストの最後の要素のうち一つ前を検索する
object p02 extends App {
  def penultimate[T](list: List[T]): T = list match {
    case x :: _ :: Nil => x
    case _ :: tail  => penultimate(tail)
    case _             => throw new NoSuchElementException
  }

  def penultimateBuiltin[T](list: List[T]): T = {
    if (list.isEmpty) throw new NoSuchElementException
    else list.init.last
  }

  val list: List[Int] = List(1, 1, 2, 3, 5, 8)
  println(penultimate(list))
}
