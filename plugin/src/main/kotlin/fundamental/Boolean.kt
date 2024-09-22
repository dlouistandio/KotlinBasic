package fundamental

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

//    Operator AND (&&) akan mengembalikan nilai true jika semua hasil evaluasi expression yang diberikan bernilai true.
    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    print("Office is open : $isOpen")

//     operator OR (||) akan mengembalikan nilai true jika hasil evaluasi dari salah satu expressions yang diberikan bernilai true
    val isClose = now < officeOpen || now > officeClosed

    print("Office is closed : $isClose")

//    operator NOT(!) digunakan untuk melakukan negasi pada hasil evaluasi expression yang diberikan
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}