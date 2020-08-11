package s99

import scala.annotation.tailrec

//リストNを左に回転する
object p19 extends App{

  @tailrec
  def rotate[T](n: Int, list: List[T]): List[T] = {
    val nBounded = if (list.isEmpty) 0 else n % list.length
    if (nBounded < 0) rotate(nBounded + list.length, list)
    else (list.drop(nBounded)) ::: list.take(nBounded)
  }

  val list: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l, 'm, 'n)
  println(rotate(3, list))
}
