package controlFlow

fun main() {
    val openOffice = 7
    val now = 8

//    if dikatakan sebagai statement karena ia tidak mengembalikan nilai apapun, hanya sebagai percabangan
    if (now > openOffice) {
        print("Office already open")
    } else {
        print("Office close")
    }

/*
If pada bahasa Kotlin juga bisa digunakan sebagai expression.
Yang dimaksud dengan expression adalah statement yang dapat mengembalikan nilai dan bisa kita simpan ke dalam sebuah variabel
*/
    val office = if (now > openOffice) "Office already open" else "Office close"
    print(office)
}