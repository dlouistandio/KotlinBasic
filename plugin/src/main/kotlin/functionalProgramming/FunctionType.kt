package functionalProgramming

//Fungsi tersebut memiliki 2 (dua) parameter dengan tipe Int dan memiliki tipe kembalian Int.
typealias Arithmetic = (Int, Int) -> Int

fun main() {
//    Untuk membuat instance dari sebuah function type, terdapat beberapa cara. Salah satunya dengan lambda expression
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
    val divide: Arithmetic = { angkaSatu, angkaDua -> angkaSatu - angkaDua }

//    Untuk menggunakan instance-nya, kita bisa memanfaatkan operator invoke()
    val multiplyResult = multiply.invoke(20, 20)
//    Atau tanpa operator invoke()
    val sumResult = sum(10, 10)

//    Kita juga bisa menandai function type sebagai nullable dengan menempatkannya di dalam tanda kurung dan diakhiri dengan safe call
    val divideResult = divide?.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
    println(divideResult)
}