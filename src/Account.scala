import scala.collection.mutable.ListBuffer

/**
  * Created by parshah on 21-Jul-16.
  */
object Account {
  var amount: ListBuffer[BigInt] = ListBuffer(0,0,0,0,0)
  var user: ListBuffer[String] = ListBuffer("user1","user2","user3","user4","user5")
  var PIN: ListBuffer[Int] = ListBuffer()

  def view_amount(i:Int): BigInt = {
    return amount(i)
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
//}
  def checkPIN(x:Int): Boolean ={
    if (x == PIN){
      return true
    }
    else{
      return false
    }
  }

}
