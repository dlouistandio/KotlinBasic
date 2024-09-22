package objectOriented


/*
Polimorphism dapat diartikan sebagai sebuah nama fungsi yang dapat melakukan hal yang yang bermacam-macam untuk melakukan hal tersebut bisa melakukan overloading
Overloading merupakan kondisi di mana kita bisa membuat 2 (dua) atau lebih fungsi yang memiliki jumlah, tipe, atau urutan parameter yang berbeda di dalam sebuah class.
*/
class AnimalOverloading(private var name: String) {
    /*
    terdapat beberapa fungsi dengan penamaan yang sama, tetapi tidak menyebabkan eror.
    Sebabnya, fungsi tersebut memiliki parameter yang berbeda sehingga tidak akan terjadi ambiguitas dalam penggunaan fungsi tersebut
    */
    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

class Calculator {
    fun add(value1: Int, value2: Int) = value1 + value2
    fun add(value1: Int, value2: Int, value3: Int) = value1 + value2 + value3
    fun add(value1: Double, value2: Double) = value1 + value2
    fun add(value1: Float, value2: Float) = value1 + value2

    fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2
    fun min(value1: Double, value2: Double) = if (value1 < value2) value1 else value2
}

fun main() {
    val dicodingCat = AnimalOverloading("Dicoding Miaw")

    dicodingCat.eat()
    dicodingCat.eat("Ikan Tuna")
    dicodingCat.eat("Ikan Tuna", 450.0)

    val calc = Calculator()

    println(calc.add(2, 4))
    println(calc.add(2.5, 2.2))
    println(calc.add(6f, 7f))
    println(calc.add(1, 2, 3))

    println(calc.min(9, 2))
    println(calc.min(17.2, 18.3))
    /*
    Pada contoh yang kita buat, fungsi add(2, 4) memanggil fungsi add yang memiliki parameter Integer,
    fungsi add(2.5, 2.2) memanggil fungsi add yang memiliki parameter Double
    */
}
