package objectOriented

/*
Untuk membuat sebuah super atau parent class kita akan membutuhkan open class.
Kelas pada Kotlin secara default bersifat final, oleh karena itu kita harus mengubahnya menjadi open class sebelum melakukan extends kelas tersebut.
*/
open class AnimalInheritance(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

/*
Dengan teknik inheritance, kita bisa mengelompokkan properti dan fungsi yang sama.
Caranya, buat sebuah kelas baru yang nantinya akan diturunkan sifatnya pada sebuah kelas
Dalam Kotlin untuk melakukan extends pada sebuah kelas dapat dilakukan dengan tanda :
*/
class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : AnimalInheritance(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    /*
    Keyword override untuk mengambil alih atau mengganti implementasi fungsi dari parent class.
    Jika dilihat, itu artinya sebuah fungsi dengan nama yang sama bisa memiliki perilaku yang berbeda
    */
    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

class Fish(name: String, weight: Double, age: Int, isCarnivore: Boolean,) : AnimalInheritance(name, weight, age, isCarnivore){
    /*
     jika Anda tidak ingin mengambil alih penuh, tetapi hanya ingin menambahkan implementasi dari yang sudah di parent class?
     Jawabannya adalah dengan menggunakan keyword super
     Dengan begitu, kedua implementasi, baik di parent class (kelas induk) maupun di subclass (kelas turun) tetap dijalankan
    */
    override fun eat(){
        super.eat()
        println("$name sedang memakan ikan !")
    }
}


fun main(){
    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()

    val dicodingFish = Fish("Dicoding Uhuy", 3.2, 2, true)
    dicodingFish.eat()
}

