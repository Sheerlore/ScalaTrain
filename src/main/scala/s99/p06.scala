package s99

//リストがパリンドロームかどうか調べる
//パリンドローム　→　回文
object p06 extends App {
  def isPalindrome[T](list: List[T]): Boolean = {
    list == list.reverse
  }
  println(isPalindrome(List(1, 2, 3, 2, 1)))
}
