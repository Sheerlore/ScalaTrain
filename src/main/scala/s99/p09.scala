package s99

//リスト要素の連続して重複した部分をサブリストにパックする
//リストに繰り返し要素が含まれている場合は別々のサブリストに配置する必要がある
object p09 extends App{

  def pack[T](list: List[T]):List[List[T]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list.span { _ == list.head}
      if(next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

  val list: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(pack(list))
}
