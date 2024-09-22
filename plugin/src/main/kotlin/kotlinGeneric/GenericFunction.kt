package kotlinGeneric

import kotlin.collections.List

/*
Generic pada sebuah fungsi dibutuhkan ketika kita membuat sebuah fungsi yang berhubungan dengan List.
Misalnya, list yang dapat digunakan untuk berbagai tipe dan tidak terpaku pada tipe tertentu.
*/

/*
Cara mendeklarasikannya sedikit berbeda dengan kelas generic.
Tipe parameter yang berada di dalam angle bracket harus ditempatkan sebelum nama fungsi yang ditentukan.
*/
//fun <T> run(): T {
//    /*...*/
//}


fun main() {
/*
Tipe parameter pada fungsi slice() digunakan sebagai receiver dan return type.
Ketika fungsi tersebut dipanggil dari sebuah List dengan tipe tertentu, kita bisa menentukan tipe argumennya secara spesifik.
*/
//    fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
//        /*...*/
//    }

    val numbers = (1..100).toList()
    print(numbers.slice(1..10))
}
