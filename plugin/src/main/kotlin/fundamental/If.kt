package fundamental

fun main() {
    val openHours = 7
    val now = 7
    val office: String

//    menggunakan if untuk melakukan pengkondisian pada kode
//    Blok else if akan dijalankan jika hasil evaluasi pada branch sebelumnya bernilai false
//    Blok else akan dijalankan jika if dan else if false
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}