package specialClassNCollection

/*
Seperti namanya, yang dimaksud dengan anonymous adalah class yang tak memiliki nama.
Alih-alih mendefinisikan class menggunakan keyword class, Anda bisa langsung mendefinisikan isi dari sebuah class dengan menggunakan keyword object.
*/

//interface IFly {
//    fun fly()
//}
//
//fun flyWithWings(bird: IFly) {
//    bird.fly()
//}
//
//class Bird : IFly {
//    override fun fly() {
//        println("The Bird flying")
//    }
//}
//
//fun main() {
//    flyWithWings(Bird())
//}

interface IFly {
    fun fly()
    fun run()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}


fun main() {
    /*
    Perhatikan bahwa kita tidak membuat class Bird lagi, tetapi langsung mendefinisikan isi dari kelas tersebut dengan menggunakan keyword object.
    Jika dilihat, memang tidak ada nama yang diberikan untuk object yang dibuat
    */
    flyWithWings(object : IFly {
        override fun fly() {
            println("The Bird flying")
        }

        override fun run() {
            TODO("Not yet implemented")
        }
    })
}


