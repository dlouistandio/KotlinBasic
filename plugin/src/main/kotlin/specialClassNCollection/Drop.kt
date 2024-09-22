package specialClassNCollection

//fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan
fun main(){
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)
    val dropLast = number.dropLast(3)

    println(drop)
    println(dropLast)
}