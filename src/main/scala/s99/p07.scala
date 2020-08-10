package s99

//ネストされたリストを平坦化する
object p07 extends App {
  def flatten(list: List[Any]): List[Any] = list match {
    case (x: List[_]) :: tail => flatten(x) ::: flatten(tail)
    case x :: tail => x :: flatten(tail)
    case Nil => Nil
  }

  def flatten2(list: List[Any]): List[Any] = list flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))

  println(flatten2(List(List(1, 1), 2, List(3, List(5, 8)))))
}
