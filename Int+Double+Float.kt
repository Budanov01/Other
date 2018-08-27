fun main(args: Array<String>){
    val a = 15005
    val b = 1324.42f
    val c = 1539.2
    val number1: Int = a + b.toInt() + c.toInt()
    val number2: Float = a.toFloat() + b + c.toFloat()
    val number3: Double = a.toDouble() + b.toDouble() + c
    println("number1 is the sum of three constant and its type is Int, number1 = $number1")
    println("number2 is the sum of three constant and its type is Float, number2 = $number2")
    println("number3 is the sum of three constant and its type is Double, number3 = $number3")
}