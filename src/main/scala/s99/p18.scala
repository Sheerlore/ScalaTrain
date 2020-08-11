package s99

//リストからスライスを抽出する
//2 つのインデックスIとKを指定すると、スライスは、元のリストのK番目の要素を含まない I 番目の要素から、含まれる要素を含むリスト.
// 0 で要素のカウントを開始。
object p18 extends App{

  def sliceRecursive[T](i: Int, k: Int, list: List[T]): List[T] = (i, k, list) match {
    case (_, _, Nil)                 => Nil
    case (_, e, _)         if e <= 0 => Nil
    case (s, e, h :: tail) if s <= 0 => h :: sliceRecursive(0, e - 1, tail)
    case (s, e, h :: tail)           => sliceRecursive(s - 1, e - 1, tail)
  }

  def sliceBuiltin[T](i: Int, k: Int, list: List[T]): List[T] = list.slice(i, k)



  val list: List[Symbol] = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l, 'm, 'n)
  println(sliceBuiltin(3, 7, list))
  println(sliceRecursive(3, 7, list))
}
