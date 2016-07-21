/**
  * Created by cheekati on 7/21/2016.
  */
object Input {
  if()
  {
   print("please select an option")
    Options();

  }
  else
  {
    print("wrong pin reenter the correct one")
  }
def Options(i : Int): Unit ={
  if(1 < i && 6 > i) {

  }
  if(i == 1)
    {
      view account()
    }
  if(i == 2)
  {
   Deposit()
  }
  if(i == 3)
  {
    Withdraw()
  }
  if(i == 4)
  {
    Transfer()
  }


}
}
