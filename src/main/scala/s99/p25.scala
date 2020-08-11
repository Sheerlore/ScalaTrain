package s99

import scala.util.Random

//リストの要素のランダムな順列を生成する
object p25 extends App {
  import p23.randomSelect
  def randomPermute1[T](list: List[T]): List[T] = randomSelect(list.length, list)

  def randomPermute2[T](list: List[T]): List[Any] = {
    val rand = new Random()
    val a = list.toArray[Any]
    for (i <- a.length - 1 to 1 by -1) {
      val i1 = rand.nextInt(i + 1)
      val t = a(i)
      a.update(i, a(i1))
      a.update(i1, t)
    }
    a.toList
  }

  val list: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g)
  println(randomPermute1(list))
}
