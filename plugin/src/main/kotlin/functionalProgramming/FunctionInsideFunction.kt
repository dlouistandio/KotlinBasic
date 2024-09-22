package functionalProgramming


/*
kita bisa memisahkannya lagi menjadi sebuah fungsi lokal (inner function) dengan hak akses terbatas hanya untuk fungsi terluarnya.
Ini bisa dilakukan karena pada Kotlin kita bisa mendefinisikan sebuah fungsi di mana pun, bahkan di dalam sebuah fungsi (function inside function).
*/
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
//    Perlu diperhatikan, inner function hanya bisa diakses setelah fungsi tersebut didefinisikan
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}

fun sumExt(valueA: Int, valueB: Int, valueC: Int): Int {
//    Selain itu, kita juga bisa menjadikan inner function sebagai extensions function.
    fun Int.validateNumber(){
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}