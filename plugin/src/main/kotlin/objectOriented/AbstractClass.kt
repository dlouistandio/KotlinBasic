package objectOriented

/*
Secara harfiah hewan merupakan sebuah sifat. Kita tidak tahu bagaimana objek hewan tersebut.
Kita tahu bentuk kucing, ikan dan ular seperti apa tetapi tidak untuk hewan.
Maka dari itu konsep abstract class perlu diterapkan agar kelas Animal tidak dapat direalisasikan dalam bentuk objek
namun tetap dapat menurunkan sifatnya kepada child class-nya.
*/
abstract class AnimalAbstract(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan !")
    }

    open fun sleep(){
        println("$name sedang tidur !")
    }
}

class Tiger(pName: String, pWeight: Double, pAge: Int, pisCarnivore: Boolean, pColor: String): AnimalAbstract(pName, pWeight, pAge, pisCarnivore){
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


fun main(){
//    Class abstract tidak bisa membuat instance atau objek karena akan mengeluarkan error
//    val animal = AnimalAbstract("dicoding animal", 2.6, 1, true)

//    Class inheritance bisa membuat objek atau instance karena bukan abstract class namun masih bisa mengambil sifat dari abstract class
    val tiger = Tiger("Dicoding Miaw", 3.2, 2, true, "Brown")
    tiger.playWithHuman()
    tiger.eat()
}