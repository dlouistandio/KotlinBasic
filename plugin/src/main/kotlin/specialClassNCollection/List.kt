package specialClassNCollection

/*
Dengan List kita dapat menyimpan banyak data menjadi satu objek. Sebagai contoh, kita bisa membuat sebuah List yang berisi sekumpulan data angka,
karakter atau yang lainnya. Yang menarik, sebuah List tidak hanya bisa menyimpan data dengan tipe yang sama.
Namun juga bisa berisi bermacam - macam tipe data seperti Int, String, Boolean atau yang lainnya
*/

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf('a', "Kotlin", 3, true)

//    List bersifat immutable namun kita bisa menggunakan mutablelist untuk membuat list mutable
    val mutableList = mutableListOf('a', "Kotlin", 3, true)

    print(anyList)
//    Kita bisa menggunakan indexing untuk mengakses list
    print(anyList[3])

    mutableList.add('d') // menambah item di akhir list
    mutableList.add(1, "love") // menambah item pada indeks ke-1
    mutableList[3] = false // mengubah nilai item pada indeks ke-3
    mutableList.removeAt(0) // menghapus item pada indeks ke-0

    /*
    Array = Bisa menggubah namun tidak bisa menambah atau menghapus array
    List = Tidak bisa mengubah, menambah atau menghapus list
    MutableArray = Bisa merubah, menambah, atau menghapus array
    MutableList = Bisa merubah, menambah, atau menghapus list
    */
}