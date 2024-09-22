package objectOriented

/*
objek Animal dapat diinisialisasi dengan secondary constructor ketika nilai name, weight, age dan isMammal tersedia.
Tetapi jika nilai isMammal tidak tersedia,  primary constructor lah yang akan digunakan dan
nilai isMammal dapat diinisialisasi pada blok init dengan nilai default.
*/


class Animal2(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean
    lateinit var color: String
    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }

    constructor(name: String, weight: Double, age: Int, color: String): this(name, weight, age){
        this.color = color
    }
}

fun main() {
    val dicodingCat = Animal2("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = Animal2("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")

    val dicodingFish = Animal2("Dicoding tweet", 0.5, 1, "red")
    println("Nama: ${dicodingFish.name}, Berat: ${dicodingFish.weight}, Umur: ${dicodingFish.age}, mamalia: ${dicodingFish.color}")
}