package objectOriented


/*
Class: sebuah blueprint yang terdapat properti dan fungsi di dalamnya.
Properties: karakteristik dari sebuah kelas, memiliki tipe data.
Methods: kemampuan atau aksi dari sebuah kelas.
*/
class Animal() {
//    Properti dalam class
    var name: String = "Kucing"
    var weight: Double = 3.2
    var age: Int = 2
    var isMammal: Boolean = true

//    Method dalam class
    fun eat(){
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}



fun main() {
    /*
    Tanda kurung tersebut menunjukan bahwa kita membuat sebuah objek baru.
    dalam tanda kurung, kita dapat menambahkan nilai properti sesuai yang dibutuhkan pada primary constructor kelasnya
    */
    val dicodingCat = Animal()

    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()

// Mengubah Properti dari class dicodingCat
    dicodingCat.name = "Kucing Oren"
    dicodingCat.weight = 6.0
    dicodingCat.age = 3
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()


}

