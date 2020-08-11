package s99

//p10の実行長エンコードのコードを変更する
//要素に重複がない場合は結果一覧にコピーするだけで、重複する要素のみ、 (N, E)の形にする
object p11 extends App {
  import p10.encode
  def encodeModified[T](list: List[T]): List[Any] = {
    encode(list).map{ t => if(t._1 == 1) t._2 else t}
  }

  //typesafe version
  def encodeModified2[T](list: List[T]): List[Any] = {
    encode(list).map{ t => if(t._1 == 1) Left(t._2) else Right(t)}
  }

  val list: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(encodeModified(list))
}
