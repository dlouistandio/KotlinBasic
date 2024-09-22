package functionalProgramming

/*
Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan dari dalam fungsi itu sendiri.
Ini memungkinkan sebuah fungsi dapat berjalan beberapa kali.
*/

fun main() {
    println("Factorial 9999 is: ${factorial(10)}")
}


fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}


/*
Dengannya, kita bisa meminimalisir penumpukan frame ketika kita menerapkan recursive.
Tail recursion akan memastikan proses sebelumnya telah selesai sebelum pemanggilan fungsi berikutnya dijalankan
*/
tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}