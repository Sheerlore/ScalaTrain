package s99

//リストの要素を複製する
object P14 extends App{
  def duplicate[T](list: List[T]): List[T] = {
    list.flatMap{e => List(e, e)}
  }

  val list: List[Symbol] = List('a,'b, 'c, 'd, 'e)
  println(duplicate(list))
}
