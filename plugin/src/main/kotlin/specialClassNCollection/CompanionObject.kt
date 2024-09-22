package specialClassNCollection

/*
Berbeda dengan class, Anda tidak dapat membuat inner object secara langsung di dalam class. Untuk mengatasinya, Anda perlu menambahkan Companion Object
*/
class Library {
    companion object{
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }
    }
}

class MyLibrary {
    // Const 'val' are only allowed on top level, in named objects, or in companion objects
    // const val LIBRARY_NAME = "Dicoding Library"

    fun totalBook() {
        print("Total book in $LIBRARY_NAME is unlimited")
    }

    /*
    Companion Object juga biasa digunakan dalam kasus penulisan konstanta.
     Namun, karena Kotlin tidak mengenal static, Anda bisa menggunakan keyword const val.
     Sayangnya, const val hanya bisa dideklarasikan di top level atau di dalam object. Di sinilah Companion Object berperan
    */
    companion object{
        const val LIBRARY_NAME = "Dicoding Library"
    }
}

fun main() {
    Library.Companion.borrowBookById(21)
    /*
    Kita dapat memanggil fungsi yang di dalam Companion Object secara langsung dari kelas lain.
    Kita juga dapat menghapus penggunaan Companion seperti contoh pemanggilan kedua, yakni cukup Library.borrowBookById(21).
    */
    Library.borrowBookById(21)
    val name = MyLibrary.LIBRARY_NAME
}