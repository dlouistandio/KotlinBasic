package specialClassNCollection

/*
Dalam dunia Kotlin, sebuah Class dapat diinisialisasi berkali-kali di tempat dan waktu yang berbeda-beda.
Lalu, bagaimana jika kita menginginkan tanpa adanya duplikasi Class dalam penggunaanya? Di sinilah kita perlu memahami konsep Singleton.
Singleton merupakan pattern yang berguna untuk memastikan suatu object hanya memiliki satu instance dengan satu titik akses global.
*/

//Singleton dalam bahasa Kotlin sangatlah simpel dan mudah karena cukup menggunakan keyword object
object CentralLibrary {
    fun borrowBookById(id: Int) {
        print("Book with $id has been borrowed")
    }
}

fun main() {
    /*
    Berbeda dengan class biasanya, Anda tidak perlu membuat instance (inisialisasi) terlebih dahulu untuk menggunakan object.
    Anda bisa memanggil fungsi maupun property yang ada di dalamnya secara langsung.
    Menariknya, kita bisa memanggilnya di mana pun dan akan mengembalikan object yang sama setiap waktu.
    */
    CentralLibrary.borrowBookById(21)
}