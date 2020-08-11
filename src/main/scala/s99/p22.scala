package s99

import scala.annotation.tailrec

//指定範囲内のすべての整数を含むリストを作成する
object p22 extends App{
  def rangeBuiltin(start: Int, end: Int): List[Int] = List.range(start, end + 1)

  def rangeRecursive(start: Int, end: Int): List[Int] = {
    if (end  < start) Nil
    else start :: rangeRecursive(start + 1, end)
  }

  def rangeTailRecursive(start: Int, end: Int): List[Int] = {
    @tailrec
    def rangeR(end: Int, result: List[Int]): List[Int] = {
      if (end < start) result
      else rangeR(end - 1, end :: result)
    }
    rangeR(end, Nil)
  }

  println(rangeBuiltin(3, 9))
}
