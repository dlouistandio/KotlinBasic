package fundamental

fun main() {
//    Named argument digunakan ketika ingin memanggil parameter tanpa perlu mengingat posisi parameter
//    Dengan hanya mengingat nama paramater lalu tambahkan = "Data yang ining dimasukan"
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    print(fullName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}