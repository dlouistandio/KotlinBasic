package fundamental

fun main() {
//    Tanpa ? maka akan muncul error
//    val text: String = null // compile time error

//    Harus menggunakan ? ketika ada object yg null
    val text: String? = null

//    Untuk mengakses nullable menggunakan ?.
    text?.length

//    Jika ingin memberi default value jika objek null menggunakan ?:
    val text2: String? = null
    val textLength = text?.length ?: 7
}