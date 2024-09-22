package functionalProgramming

//Tanpa lambda function
fun getMessage(name: String): String {
    return "Hello $name"
}

//Menggunakan lambda function
/*
Dalam menggunakan lambda, kita tidak perlu mendeklarasi tipe spesifik untuk nilai kembaliannya.
Lambda tidak membutuhkan kata kunci fun dan visibility modifier saat dideklarasikan karena lambda bersifat anonymous.
Parameter yang akan ditetapkan berada di dalam kurung kurawal {}.
Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi karena kompiler akan secara otomatis mengembalikan nilai dari dalam body.
Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam sebuah variabel.
*/
val message :(String) -> String = { name: String ->
    "Hello $name"
}


//Anonymous tanpa lambda
val comparator = object :Runnable{
    override fun run() {
        // TODO:
    }
}

//kita bisa menghindari boilerplate code dalam menggunakan anonymous class
val comparatorLambda = Runnable {
    fun run(){
    }
}

//contoh deklarasi dari lambda versi ringkas, di mana tipe data tidak perlu dituliskan dan fungsi lambda ditandai dengan sepasang kurung kurawal.
val messageLambda = { println("Hello From Lambda") }

//ingin menambahkan sebuah parameter pada fungsi lambda, kita bisa menuliskannya seperti berikut
val printMessage = { message: String -> println(message) }

//parameter dari sebuah lambda berada di dalam kurung kurawal. Untuk membedakannya dengan body, daftar parameter yang ada dipisahkan dengan tanda ->
val messageLength = { message: String, name: String -> message.length }

fun main() {
    val length = messageLength("Hello From lambda", "Agus")
    println("Message length $length")

//    forEach menggunakan lambda expression
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }
}