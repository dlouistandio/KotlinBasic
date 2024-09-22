package kotlinGeneric

/*
Generics, yaitu sebuah konsep yang memungkinkan suatu kelas atau interface menjadi tipe parameter yang dapat digunakan untuk berbagai macam tipe data.
Secara umum generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan kita gunakan. Pendeklarasiannya ditandai dengan tipe parameter.
Kita juga bisa mengganti tipe parameter menjadi tipe yang lebih spesifik dengan menentukan instance dari tipe tersebut.
*/


//Kita bisa menerapkannya dengan meletakkan tipe parameter dalam angle brackets (<>) seperti interface generic
/*
Tipe parameter T bisa kita gunakan sebagai tipe reguler yang mengembalikan tipe dari sebuah fungsi.
Anda bisa mengatakannya sebagai place holder yang nantinya Anda dibebaskan untuk menentukan tipe dasar yang didukung oleh kode tersebut.
*/

interface List<T>{
    operator fun get(index: Int) : T
}

//Karena class ini mewarisi interface list maka kita perlu menentukan tipe dasar paramater generic untuk kelas longlist
class LongList : List<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}

fun main() {
//   class ArrayList karena menggunakan tipe argumen generic <T>. kita perlu menentukan tipe argumen saat menggunakan kelas ArrayList
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}