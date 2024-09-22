package specialClassNCollection

/*
Enum Class atau Enumeration merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek yang telah didefinisikan menjadi tipe data konstanta.
*/

fun main() {
//    Objek yang telah didefinisikan menjadi tipe data Enum dapat mengakses attribute atau method di dalam kelas Enum itu sendiri
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
}

//Objek yang berada di dalam Enum secara implisit bersifat static dan final sehingga kita tidak dapat mengubahnya setelah dideklarasikan.
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}