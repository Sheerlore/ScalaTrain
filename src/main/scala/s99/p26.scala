package s99

//リストのN個の要素からK個の組み合わせを生成する
object p26 extends App{
  def flatMapSublists[A, B](list: List[A])(f: List[A] => List[B]): List[B] = list match {
    case Nil => Nil
    case sublists@(_ :: tail) => f(sublists) ::: flatMapSublists(tail)(f)
  }

  def combinations[A](n: Int, list: List[A]): List[List[A]] = {
    if (n == 0) List(Nil)
    else flatMapSublists(list) {sl =>
      combinations(n - 1, sl.tail).map{sl.head :: _}
    }
  }

  val list: List[Int] = List(1,2,3,4,5,6)
  println(combinations(3, list))

}
