package fundamental

fun main() {
//    Char menggunakan petik satu
    var character = 'A'

//    Akan error jika lebih dari satu character
//    val character: Char = 'ABC'   // Incorrect character literal

//    Pada char kita bisa menambahkan operator increment dan decrement
    println("character " + character++)
    println("character " + character++)
    println("character " + character++)
    println("character " + character--)
    println("character " + character--)
    println("character " + character--)
    println("character " + character--)
}