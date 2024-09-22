package functionalProgramming

//Kita bisa memisahkan lambda expression menjadi fungsi tersendiri dan mereferensikannya langsung sebagai instance dari function type
val sumRef: (Int, Int) -> Int = ::count

fun count(valueA: Int, valueB
: Int): Int {
    return valueA + valueB
}

fun main() {
    val numbers = 1.rangeTo(10)
    /*
    Dengan menggunakan operator :: kita bisa menggunakannya sebagai instances dari function type.
    Sebagai contoh, penggunaan fungsi filter() yang menjadi bagian dari kelas List
    */
//    Selain itu, kita juga bisa mereferensikan sebuah extensions function. dengan ikut menyertakan objek yang menjadi receivernya sebelum operator ::
    val evenNumbers = numbers.filter(Int::isEvenNumber)
    println(evenNumbers)

    /*
    Operator :: juga dapat digunakan untuk mereferensikan sebuah properti.
    kita bisa mengakses apa yang menjadi bagian dari properti tersebut seperti nama, fungsi setter getter
    */
    println(::message2.name)
    println(::message2.get())

    ::message2.set("Kotlin Academy")

    println(::message2.get())
}

var message2 = "Kotlin"
fun Int.isEvenNumber() = this % 2 == 0