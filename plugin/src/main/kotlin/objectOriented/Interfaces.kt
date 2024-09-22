package objectOriented

/*
Interfaces merupakan suatu konsep sifat umum yang nantinya digunakan oleh suatu kelas agar dapat memiliki sifat tersebut
*/
interface IFly {
    fun fly()
    val numberOfWings: Int
    fun eat()
}

class Bird(override val numberOfWings: Int) : IFly {

    /*
    Kelas yang mengimplementasikan sebuah interface
    diharuskan melakukan override seluruh properti
    dan fungsi sekaligus mendefinisikan isi fungsi yang terdapat pada interfaces-nya.
    */
    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }

    override fun eat(){
        if(numberOfWings >2) println("Eat")
        else println("Dont eat")
    }
}

