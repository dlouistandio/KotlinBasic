package controlFlow

/*
Do While bersifat Exit Controlled Loop di mana proses perulangan akan langsung dijalankan di awal. Jika telah selesai, barulah kondisi yang diberikan akan dievaluasi.
*/

fun main() {
    var counter = 1
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)


//    Infinite loop terjadi jika kondisi yang diberikan selamanya terpenuhi atau bernilai true.
    var value = 'A'
    do {
        print(value)
    } while (value <= 'Z')
}