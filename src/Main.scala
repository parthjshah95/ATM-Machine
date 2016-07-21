

/**
  * Created by parshah on 21-Jul-16.
  */
object Main {
  def main(args: Array[String]): Unit = {
    method()
    def method() {
      def user(): Int = {
        var acc: Int = 0
        acc = Account.user.indexOf(Input.getusername())
        if (acc == -1) {
          println("invalid username")
          user()
        }
        else {
          return acc
        }
      }
      val acc = user()
      PIN()
      def PIN() {
        if (Account.checkPIN(Input.getpin(), acc)) {
        }
        else {
          PIN()
        }
      }
      var o: Int = Input.Option()
      o match {
        case 1 => println("your account balance is " + Account.amount(acc))
        case 2 => Account.deposit(Input.Amount(), acc); println("your account balance is " + Account.amount(acc))
        case 3 => Account.withdraw(Input.Amount(), acc); println("your account balance is " + Account.amount(acc))
      }
      print("Success!\nTo perform another operation")


      method()
    }
  }
}
