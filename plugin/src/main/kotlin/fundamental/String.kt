package fundamental

fun main() {
    val textString  = "Kotlin"

//    Bisa mengambil bagian string menggunakan index
    val firstChar = textString[3]
    print("The 4th character of the $textString is $firstChar")

//  Escaped string menggunakan \
    val statement = "Kotlin is \"Awesome!\""

//    Bisa menggunakan """ untuk membuat string yang panjang dan menambahkan trimIndent untuk menghilangkan string yang kosong
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

//    Bisa menggabungkan string menggunakan tanda + atau dengan memanggil variable menggunakan $
    val name = "Kotlin"
    print("My name is " + name)

    val name2 = "Kotlin"
    val old = 3
    print("My name is $name2, im $old years old")

//    Kita juga bisa memasukan expressin kedalam string menggunakan {}
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")

}