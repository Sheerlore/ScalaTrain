package s99

//リストの要素数を検索する
object p04 extends App{
  def lengthBuiltin[T](list: List[T]): Int = list.length

  def lengthRecursive[T](list: List[T]): Int = list match {
    case Nil => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }

  def lengthfunction[T](list: List[T]): Int = list.foldLeft(0) {(c, _) => c + 1}

  val list: List[Int] = List(1, 1, 2, 3, 5, 8)

  println(lengthRecursive(list))
  println(lengthBuiltin(list))
  println(lengthfunction(list))

}
