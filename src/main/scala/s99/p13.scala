package s99

//リストの実行長エンコード（直接解）
//実行長エンコーディングデータ圧縮メソッドを直接実行する。
//p09とは別な方法
object p13 extends App {
  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    if(list.isEmpty) Nil
    else{
      val (packed, next) = list.span{ _ == list.head}
      (packed.length, packed.head) :: encodeDirect(next)
    }
  }

  val list: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(encodeDirect(list))
}
