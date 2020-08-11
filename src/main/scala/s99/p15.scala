package s99

//リストの要素を指定の回数だけ複製する
object p15 extends App{
  def duplicateN[T](n: Int, list: List[T]): List[T] = {
    list.flatMap{e => List.fill(n)(e)}
  }

  val list: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f)
  println(duplicateN(3, list))
}
