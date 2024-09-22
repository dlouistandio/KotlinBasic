package fundamental

//Disini kita sudah menulis data default
fun getFullNameDefault(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
//    Jadi disini tidak perlu memasukan argument tapi
    val fullName = getFullNameDefault()
    print(fullName)

//    Tapi kita bisa saja mengganti data yang ada pada paramater
    val changeName = getFullNameDefault(first = "Ganti")
}