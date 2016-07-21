/**
  * Created by cheekati on 7/21/2016.
  */
object Input {
  var Z = 0

  

  {
    print("please select an option")
    def Options(i : Int): Unit = {
      if (1 < i && 6 > i) {

      }
      if (i == 1) {
        print("You can view your account now")
        view account()
      }
      if (i == 2) {
        print("YOu can Deposit into account now")
        Deposit()
      }
      if (i == 3) {
        print("YOu can Withdraw From account now")
        Withdraw()
      }
      if (i == 4) {
        print("You can Withdraw From account now")
        Transfer()
      }
      else {
        print("wrong pin reenter the correct one")
      }
      print("please select an option")
      Options(i: Int);
    }





}
}
