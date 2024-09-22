package functionalProgramming

/*
Pada dasarnya sebuah lambda yang mempunyai receiver mirip seperti extension functions,
yang memungkinkan kita untuk mengakses anggota objek receiver dari dalam extension.
Pada lambda, receiver ditentukan pada saat menentukan tipe deklarasi.
*/

fun buildString(action: StringBuilder.() -> Unit): String {
/*
 StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action.
 Dengan begitu kita dapat memanggil parameter action tersebut dari variabel yang bertipekan StringBuilder
*/
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }
    println(message)
}