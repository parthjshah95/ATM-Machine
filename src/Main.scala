/**
  * Created by parshah on 21-Jul-16.
  */
object Main {
  def main(args: Array[String]): Unit = {
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

  }
}
