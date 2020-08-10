package s99

//リストのK番目の要素を検索する
object p03 extends App {
  def nth[T](index: Int, list: List[T]): T = list match {
    case x :: _ if index == 0 => x
    case _ :: xs if index > 0 => nth(index - 1, xs)
    case _                    => sys.error("")
  }

  def nth2[T](index: Int, list: List[T]): T = (index, list) match {
    case (0    , h :: _   ) => h
    case (index, _ :: tail) => nth2(index - 1, tail)
    case ( _   , Nil      ) => throw new NoSuchElementException

  }

  def nthBuiltin[T](index: Int, list: List[T]): T = {
    if (index >= 0) list(index)
    else throw new NoSuchElementException
  }


  val list: List[Int] = List(1, 1, 2, 3, 5, 8)
  println(nth(2,list))
}
