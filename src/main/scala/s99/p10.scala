package s99

//リストの実行長エンコード
//問題p09の結果を使用して、いわゆる実行長エンコード　データ圧縮方法を実装する。
//連続する要素の複製はタプルとしてエンコードされ、Nは要素Eの重複数として表現（N, E）
object p10 extends App {
  import p09.pack
  def encode[T](list: List[T]): List[(Int, T)] = {
    pack(list).map {e => (e.length, e.head)}
  }

  val list: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(encode(list))

}
