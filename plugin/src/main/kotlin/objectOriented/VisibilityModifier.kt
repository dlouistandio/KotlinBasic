package objectOriented

//Dengan menggunakan hak akses private, maka kita tidak diizinkan untuk mengakses properti pada kelas tersebut dari luar kelasnya
class AnimalPrivate(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

//    Satu satunya cara untuk mengakses properti private dari sebuah kelas adalah dengan menambahkan fungsi getter dan setter secara manual.
    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}


/*
Hak akses protected digunakan ketika kita menginginkan sebuah anggota dari
induk kelas dapat diakses hanya oleh kelas yang merupakan turunannya.
*/
open class AnimalProctected(val name: String, protected val weight: Double)

//class Cat(pName: String, pWeight: Double) : Animal(pName, pWeight)

fun main() {
    val dicodingCat = AnimalPrivate("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())

//    val cat = Cat("Dicoding Miaw", 2.0)
//    println("Nama Kucing: ${AnimalProctected.name}")
//    println("Berat Kucing: ${AnimalProctected.weight}") // error: expecting a top level declaration
}