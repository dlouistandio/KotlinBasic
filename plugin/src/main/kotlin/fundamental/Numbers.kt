package fundamental

fun main() {
    val intNumber = 100

    val longNumber: Long = 100
    val longNumberWithSuffix = 100L

    val shortNumber: Short = 10

    val byteNumber = 0b11010010

    val doubleNumber: Double = 1.3

    val floatNumber: Float = 0.123456789f

    val binary: Int = 0b010101010
    println(binary)

    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

//    Untuk mempermudah pembacaan kita bisa menggunakan _ untuk memisahkan angka
    var price: Long = 9_000_000_000L;
    println(price)

/*
Konversi number ke type lain bisa menggunakan
toByte(): Byte
toShort(): Short
toInt(): Int
toLong(): Long
toFloat(): Float
toDouble(): Double
toChar(): Char
*/
    var priceInt: Int = price.toInt()
    println(priceInt)

    var doubleBinary: Double = binary.toDouble()
    println(doubleBinary)
}