package specialClassNCollection

/*
Dalam penggunaannya, fungsi slice() membutuhkan sebuah argumen berupa Range yang digunakan untuk menentukan posisi pertama dan terakhir yang akan disaring
*/
fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    kita juga bisa menggunakan operator step ketika argumennya disematkan
    val slice = total.slice(3..6  step 2)

    val index = listOf(2, 3, 5, 8)
//    Kemudian jika ingin menentukan posisi yang lebih spesifik, kita bisa mendefinisikannya di dalam sebuah collection, kemudian disematkan sebagai argumen
    val sliceIndex = total.slice(index)
    println(slice)
}