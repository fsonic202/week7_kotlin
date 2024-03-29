fun main(args: Array<String>) {
    println("The convertInt2Array will convert an Integer number to an Array")
    println("Result")
    print("348597 => ")
    convertInt2Array(348597)
    print("258 => ")
    convertInt2Array(258)
}
fun convertInt2Array(guess: Int) {
    var temp: Int = guess
    val array = ArrayList<Int>()
    do {
        array.add(temp % 10)
        temp /= 10
    } while (temp > 0)
    println(array)
}