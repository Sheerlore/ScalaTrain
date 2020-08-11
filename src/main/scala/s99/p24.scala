package s99

//ロト：集合1からMとは異なる乱数Nを描画する
object p24 extends App {
  import p23.randomSelect
  import p22.rangeBuiltin

  def lotto(n: Int, m: Int): List[Int] = randomSelect(n, rangeBuiltin(1, m))

  def lotto2(count: Int, max: Int): List[Int] = randomSelect(count, List.range(1, max + 1))

  println(lotto(6, 49))
}
