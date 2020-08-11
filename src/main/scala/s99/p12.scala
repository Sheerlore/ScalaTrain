package s99

//実行長エンコードリストをデコードする
//p10で生成された実行長コードリストを非圧縮状態にする
object p12 extends App{
  import p10.encode
  def decode[T](list: List[(Int, T)]): List[Any] = {
    list.flatMap{e => List.fill(e._1)(e._2)}
  }

  val list: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(decode(encode(list)))

}
