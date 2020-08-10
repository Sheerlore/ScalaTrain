package s99

//リストを逆にする
object p05 extends App{

  def reverseBuiltin[T](list: List[T]): List[T] = list.reverse

  def reverseRecursive[T](list: List[T]): List[T] = list match {
    case Nil  => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  def reverseFunction[T](list: List[T]): List[T] = {
    list.foldLeft(List[T]()) {(r, h) => h :: r}
  }

  val list: List[Int] = List(1, 1, 2, 3, 5, 8)
  println(reverseBuiltin(list))

}
