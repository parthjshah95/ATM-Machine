/**
  * Created by cheekati on 7/21/2016.
  */
object Account1 {
  var amount: BigInt = 0
  var user: String = "user1"
  var PIN: Int = 9999
  var Z = 0

  def view_amount(): BigInt = {
    return amount
  }

  def deposit(x: BigInt): BigInt = {
    amount += x
    amount
  }

  def withdraw(x: BigInt): BigInt = {
    amount -= x
    amount
  }

//  def Change_PIN(x: Int): String = {
//    if (x >= 1000 && x <= 9999) {
//      PIN = x
//      return "PIN has been changed"
//    }
//    else{
//      return "Invalid PIN format. Please enter a number between 1000 and 9999"
//    }
//  }

}
