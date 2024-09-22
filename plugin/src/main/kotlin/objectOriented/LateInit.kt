package objectOriented

// Lateinit merupakan keyword yang ditambahkan sebelum variabel untuk membuat proses inisialisasi bisa ditunda
lateinit var name: String
fun main() {
    name = "Dicoding Miaw"
//    Kita juga dapat memeriksa apakah variabel tersebut sudah diinisialisasi dengan menggunakan fungsi isInitialized
    if (::name.isInitialized)
        print(name.length)
    else
        print("Not Initialized")
}