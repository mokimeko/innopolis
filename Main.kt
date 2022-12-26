import kotlin.math.pow

fun main() {
    //task 1
    val lastname = "Романова"
    val firstname = "Елизавета"
    val profession = "Наладчик технологического оборудования"
    println("$firstname $lastname ,$profession \n")

    //task 2
    var byte: Byte = 11
    var short: Short = 32000
    var int: Int = -2.0.pow(29.0).toInt()
    var long: Long = -2.0.pow(62.0).toLong()
    var float: Float = 0.37F
    var double: Double = 93.24563
    var boolean: Boolean = false
    var char: Char = 'R'
    println(
        "byte: $byte \n" +
                "short: $short \n" +
                "int: $int \n" +
                "long: $long \n" +
                "float: $float \n" +
                "double: $double \n" +
                "boolean: $boolean \n" +
                "char: $char \n"
    )

    //task 3
    print("Введите текст")
    val name = readLine()
    val comparison = ("$name == $name")
    println("Привет $name! \n" +
            "$comparison \n"

    )
}
