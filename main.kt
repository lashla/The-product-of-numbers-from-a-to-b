fun main() {
    var enteredNumber = readLine()!!.toInt()
    var enteredNumber_2 = readLine()!!.toInt()
    var product: Long = 1;
    for (element in enteredNumber..(enteredNumber_2 - 1)){
        product *= element
    }
    println(product)
}
