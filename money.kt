fun main(args: Array<String>){
    println("Hello ! 1\$ = 67.79\u20BD")
    return message()
}
//message and select conversion
fun message(){
    println("What would you like to convert ? \n " +
            "Please, enter the 'R' if you want to convert from \u20BD to \$, " +
            "enter the 'D' for convert from \$ to \u20BD.")
    val currency: String = readLine()!!.toString()
    if (currency == "R" || currency == "r"){
        return convertToDollar()
    }
    if (currency == "D" || currency == "d"){
        convertToRubles()
    }
    else{
        println("Please enter the correct.")
        message()
    }
}
// currency conversion from rubles to dollar
fun convertToDollar(){
    println("How many rubles do you want to convert.")
    val rubles: Double = readLine()!!.toDouble()
    val dollar = 67.79
    val a: Double = rubles / dollar * 100
    val b: Long = Math.round(a)
    val total: Double = b.toDouble() / 100
    println("$total $")
    return anew()
}
// currency conversion from dollar to rubles
fun convertToRubles(){
    println("How many dollar do you want to convert.")
    val dollar: Double = readLine()!!.toDouble()
    val rubles = 67.79
    val a: Double = dollar * rubles * 100
    val b: Long = Math.round(a)
    val total: Double = b.toDouble() / 100
    println("$total \u20BD")
    return anew()
}
//repeat operation
fun anew(){
    println("Would you like to convert something else. \n" +
            "If yes please enter the 'yes' or 'no' to finish the conversion.")
    val new: String = readLine()!!.toString()
    if (new == "yes"){
        return message()
    }
    if (new == "no"){
        println("Thank you for visit.")
    }
    else{
        println("Please enter the correct.")
        return anew()
    }
}