/**
  * Created by cheekati on 7/21/2016.
  */
object Input

{
  print("please Enter user Name")
  var X: String = io.StdIn.readLine()
  def getusername() {
    return X
  }
  print("please Enter Pin")
  var Y :Int = io.StdIn.readInt()
  def getpin() {
    return Y
  }
  print("please select an option")
  var i :Int =io.StdIn.readInt()

  if(Y ==PIN)
  {
    print("please select an option")
    def Option(i : Int): Unit = {

      if (0 < i && 6 > i) {

      if (i == 1) {
        print("You can view your account now")
        return 1
      }
      if (i == 2)
      {
        print("You can Deposit into account now")
        return 2
      }
      if (i == 3)
      {
        print("You can Withdraw From account now")
        return 3
      }
      if (i == 4)
      {
        print("You can check your balance now")
        return 4
      }
    }

      else {
        print("wrong pin/user Name reenter the correct one")
      }
      }



    print("please select an option")
    Option(i)



}
}
