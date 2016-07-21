/**
  * Created by cheekati on 7/21/2016.
  */
object Input {

  def getusername(): String = {
    println("please Enter user Name")
    var X: String = io.StdIn.readLine()
    return X
  }
  def invalid_username(): Unit ={
    println("invalid username")
    getusername()
  }

  def getpin(): Int = {
    println("please Enter Pin")
    var Y: Int = io.StdIn.readInt()
    return Y
  }


  def Option(): Int = {
    println("please select an option:\ntype 1 to view account balance\ntype 2 to deposit\ntype 3 to withdraw\ntype 4 to transfer to another account")
    var i: Int = io.StdIn.readInt()
    if (0 < i && 5 > i) {

      if (i == 1) {
        println("You can view your account balance now")
        return 1
      }
      if (i == 2) {
        println("You can Deposit into account now")
        return 2
      }
      if (i == 3) {
        println("You can Withdraw From account now")
        return 3
      }
      if (i == 4) {
        println("You can check your balance now")
        return 4
      }
      else {
        println("please type a valid number")
        Option()
      }
    }
  }
}
