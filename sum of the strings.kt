fun main(args: Array<String>){
    val string1 = "Всего в это строчке "
    val string2 = "3"
    val string3 = " значения чисел ("
    val string4 = "6.69, "
    val string5 = "45, "
    val string6 = "1.7803E12"
    val string7 = "), произведение которых равно: "
    val number1 = 6.69
    val number2 = 45
    val number3 = 1.7803E12
    val number: Double = number1 * number2 * number3                                   //multiplication of numbers
    val string = string1 + string2 + string3 + string4 + string5 + string6 +string7    //addition of the stings
    val result = string + number    //adding the result to the string
    println(result)
}