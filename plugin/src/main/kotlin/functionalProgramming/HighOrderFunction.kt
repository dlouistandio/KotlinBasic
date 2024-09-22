package functionalProgramming

fun main() {
//    kita bisa juga melampirkan isi lambda secara langsung ketika fungsi printResult()
    printResult(10){ value ->
        value + value
    }

    twoParamater(10, 2){
        angka1, angka2 -> angka1 /angka2
    }

    printMessage("Dicoding") { name: String ->
        "Hello $name"
    }

    printResult(10 ,sum)
    twoParamater(5, 2, div)
}

//Higher-Order Function, yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter, menjadikan tipe kembalian, ataupun keduanya.
fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

fun twoParamater(angka1: Int, angka2: Int, div: (Int, Int) -> Int){
    val result = div(angka1, angka2)
    println(result)
}

fun printMessage(name: String, message: (String) -> String) {
    println(message(name))
}

var sum: (Int) -> Int = { value -> value + value }
var div: (Int, Int) -> Int = { angka1, angka2 -> angka1 / angka2}