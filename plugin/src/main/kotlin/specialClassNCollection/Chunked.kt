package specialClassNCollection

import java.util.*

/*
Sama seperti fungsi split(), fungsi chunked() bisa kita gunakan untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array.
Namun untuk penerapannya sedikit berbeda, di mana fungsi split() membutuhkan argumen berupa RegEx sebagai parameter sedangkan chunked()
membutuhkan nilai yang akan digunakan sebagai jumlah indeks untuk pemisah
*/
fun main() {
    val word = "QWERTY"
    val chunked = word.chunked(3){
//        Selain itu, kita juga bisa menggunakannya untuk memodifikasi setiap nilai yang sudah dipecah.
        it.toString().lowercase(Locale.getDefault())
    }

    println(chunked)
}