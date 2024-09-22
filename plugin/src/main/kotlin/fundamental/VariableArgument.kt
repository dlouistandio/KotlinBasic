package fundamental

fun main() {
//    Disini ada banyak argument yang disematkan ketika fungsi dipanggil
    val number = getNumberSize(10, 20, 30, 40, 50)
    print(number)
}

//    Vararg digunakan ketika tidak mengetahui jumlah argumen yang akan disematkan ketika fungsi tersebut dipanggil
//    tidak diizinkan untuk memiliki 2 parameter bertanda vararg
fun getNumberSize(vararg number: Int): Int {
    return number.size
}

//    Dan jika ada parameter lain vararg lebih baik ditaruh paling belakan
fun sets(name: String, vararg number: Int): String {
    return "name $name and $number"
}