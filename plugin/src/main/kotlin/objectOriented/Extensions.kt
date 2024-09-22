package objectOriented

fun main() {
    10.printInt()
    println(10.plusThree())
    println(10.slice)
    "Agus".name
    val result = 5 sum 3 // Menggunakan Infix Function
    println(result)
}


//Extension Functions
/*
Untuk mendeklarasikan sebuah extension functions, kita perlu menentukan terlebih dahulu receiver type,
kemudian nama dari fungsi tersebut yang mana keduanya dipisahkan oleh titik (.)
*/

fun Int.plusThree(): Int {
    //jika extension functions tersebut dapat mengembalikan nilai, deklarasinya pun sama halnya seperti fungsi pada umumnya
    return this + 3
}

//Int digunakan sebagai receiver type, sedangkan kata kunci this adalah receiver type yang bertindak sebagai objeknya
fun Int.printInt() {
    print("value $this")
}

/*
Extension Properties
Untuk menambah sebuah properti baru pada sebuah kelas tanpa harus menyentuh kode di dalam kelas tersebut.
Deklarasinya pun sama seperti extension functions. Kita terlebih dahulu menentukan receiver type kemudian nama dari properti tersebut
*/
val Int.slice: Int
//   extension properties hanya bisa dideklarasikan dengan cara menyediakan getter atau setter secara eksplisit.
    get() = this / 2

val String.name: Unit
    get() = println("Hello $this")

//Infix Function
//Anda bisa menggunakan infix function untuk memanggil suatu fungsi dengan cara yang lebih ringkas
infix fun Int.sum(value: Int): Int {
    return this + value
}

class MyHero {
    infix fun addHero(s: String) { /*...*/ }

    fun build() {
//        Ketika memanggil method dengan notasi infix, Anda bisa menggunakan this yang nantinya akan mereferensikan ke method tersebut.
        this addHero "Superman"   // Correct
        addHero("Spidermen")       // Correct
        //  addHero "Ironman"        // Incorrect: the receiver must be specified
    }
}

/*
beberapa syarat untuk menggunakan infix function.
Infix function harus merupakan sebuah member function atau extension function.
Harus memiliki satu parameter saja.
Parameter tidak boleh berupa generic dan tidak memiliki nilai default.
*/
