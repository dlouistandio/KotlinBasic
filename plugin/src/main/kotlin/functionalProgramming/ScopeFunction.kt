package functionalProgramming



fun main() {
    val text = "Hello"
//    Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
    val result = text.run {
//        Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this).
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
//    Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian.


    val message = "Hello Kotlin!"
    /*
    Pada dasarnya fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa.
    Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver.
    */
    val resultMsg = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }

    val resultMsg2 = with(message) {
//        Nilai yang akan dikembalikan adalah berdasarkan expression yang berada di dalam blok lambda
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(resultMsg2)

    /*
    nilai yang dikembalikan dari fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this).
    Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya.
    */
    val messageApply = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(messageApply.toString())
}