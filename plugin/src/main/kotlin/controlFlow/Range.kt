package controlFlow

fun main() {
    /*
    Variabel rangeInt di atas mencakup nilai 1, 2, 3, 4, 5, 6, 7, 8, 9, 10. Jarak antara dua nilai yang dicakup, ditentukan oleh step.
    */
    val rangeInt = 1..10
    println(rangeInt.step)

//  Dan untuk mengubah nilai dari step bisa dilakukan ketika kita menginisialisasi nilai yang dicakup Range
    val rangeInt2 = 1..10 step 2
    rangeInt2.forEach {
        println("$it ")
    }
    println(rangeInt2.step)

//  Kita bisa menggunakan downTo untuk membuat range 10 -> 1
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

//    Selain angka range juga bisa digunakan pada char
    val rangeChar = 'A'.rangeTo('F')
}