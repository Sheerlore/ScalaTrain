package s99

import scala.util.Random

//リストからランダムに選ばれた要素を与えられた数だけ抽出する
object p23 extends App{
  import p20.removeAt

  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    if (n <= 0) Nil
    else {
      val (rest, e) = removeAt(new Random().nextInt(list.length), list)
      e :: randomSelect(n - 1, rest)
    }
  }

  def randomSelect2[T](n: Int, list: List[T]): List[T] = {
    def randomSelectR(n: Int, list: List[T], r: util.Random): List[T] = {
      if (n <= 0) Nil
      else {
        val (rest, e) = removeAt(r.nextInt(list.length), list)
        e :: randomSelectR(n - 1,rest, r)
      }
    }
    randomSelectR(n, list, new Random())
  }


  val list: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l, 'm, 'n)
  println(randomSelect(3, list))

}
