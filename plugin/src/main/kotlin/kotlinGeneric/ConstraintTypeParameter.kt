package kotlinGeneric

/*
kita bisa membatasi berbagai tipe yang dapat digunakan sebagai parameter.
Untuk menentukkan batasan tersebut, Anda dapat menambahkan tanda titik dua (:) setelah tipe parameter, kemudian diikuti oleh tipe yang akan dijadikan batasan
*/

/*
kode di atas, kita telah menentukan Number sebagai batasan tipe argumen.
Dengan begitu, kita hanya bisa memasukkan tipe argumen Number pada kelas ListNumber.
Maksud dari tipe Number ini berarti, Integer, Long, Double, dan tipe angka lainnya
*/
class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}




fun main() {
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
//    val numbers3 = ListNumber<String>() // error : Type argument is not within its bounds

    val numbersList = listOf(1, 2, 3, 4, 5)
    numbersList.sumNumber()
    val names = listOf("dicoding", "academy")
//    names.sumNumber() // error : inferred type String is not a subtype of Number
}

/*
Fungsi ini merupakan extensions function dari kelas List yang mempunyai tipe parameter.
Sama halnya dengan deklarasi generic pada sebuah fungsi, tipe parameter T pada fungsi tersebut juga akan digunakan sebagai receiver dan return type.
*/
fun <T : Number> kotlin.collections.List<T>.sumNumber(){
    /* .. */
}