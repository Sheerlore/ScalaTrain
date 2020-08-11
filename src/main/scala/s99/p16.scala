package s99

//リストからN番毎の要素をドロップする
object p16 extends App{
  def drop[T](n: Int, list: List[T]): List[T] = {
    list.zipWithIndex.filter{v => (v._2 + 1) % n != 0} map{ _._1}
  }

  def dropRecursive[T](n: Int, list: List[T]): List[T] = {
    def dropR(c: Int, curList: List[T]): List[T] = (c, curList) match {
      case (_, Nil)       => Nil
      case (1, _ :: tail) => dropR(n, tail)
      case (_, h :: tail) => h :: dropR(c - 1, tail)
    }

    dropR(n, list)
  }


  val list: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l, 'm, 'n)
  println(drop(3,list))
  println(dropRecursive(3, list))

}
