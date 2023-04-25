fun main() {
  var current =CurrentAccount(234567,"Aisha Ali",50000)
    current.deposit(56000.00)
    current.withdraw(20000.00)
    current.details()

    multiples()

    val save=SavingsAccount(45778,"Mary Wanjiku",5600,3000)
    save.deposit(10000.00)
    save.withdraw(2500.00)
    save.details()

//    val randomname = "example"
//    val result = analyzeString(randomname)
//    println(result)

    val random=checkNames(("My name is Lucy and I am a girl"))
    println(random)


}
//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun checkNames(randomname: String): String {
    val first = randomname.first()
    val last = randomname.last()
    val length = randomname.length
    val startsWithVowel = randomname.startsWith("a") ||
                           randomname.startsWith("e") ||
                         randomname.startsWith("i") ||
                           randomname.startsWith("o") ||
                           randomname.startsWith("u")

    return "First character: $first\n" +
           "Last character: $last\n" +
           "Length : $length\n" +
           "Starts with vowel: $startsWithVowel"


}



//2.Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
class CheckPassword(val password: String){
    fun checklength(){
        if (password.length==8 && password.length==16){
            println(checklength())
        }
        if else ()
    }

}


//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(){
val numbs=1..1000
    for (numb in numbs){
        if (numb%6==0 && numb%8==0){
            println("Bingo")
        }
        else{
            println(numb)
        }
    }

}

//4.Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

 open class CurrentAccount(val accountnumber:Int,val accountname:String,val balance:Int){
    fun deposit(amount: Double){
        val total=balance+amount
        println(total)
    }
     fun withdraw(amount: Double){
        val remnant=balance-amount
        println(remnant)
    }
    fun details(){
        val deets=("Account Number $accountnumber with balance $balance is operated by $accountname")
        println(deets)
    }
}



//5.Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount(accountnumber:Int, accountname:String, balance:Int,val withdrawals:Int):
    CurrentAccount(accountnumber,accountname,balance) {

//
 }




































































