package specialClassNCollection

/*
menggunakan function interface untuk membuat kode Anda lebih ringkas dan bisa dibaca dengan mudah.
Function Interface atau biasa disebut Single Abstract Method (SAM) Interface adalah sebuah interface yang memiliki satu method abstract.
Anda cukup menambahkan keyword “fun” sebelum keyword “interface”
*/

fun interface IFly2 {
    fun fly()
}

fun flyWithWingsSam(bird: IFly2) {
    bird.fly()
}

fun main() {

    /*
     penggunaan Functional (SAM) Interface yang hanya menggunakan kurung kurawal telah menggantikan semua kode yang tidak diperlukan.
     Yang perlu menjadi catatan adalah cara ini hanya bisa dilakukan pada interface yang hanya memiliki member satu fungsi saja,
     sesuai dengan namanya yakni Single Abstract Method (SAM).
    */
    flyWithWingsSam {
        println("The Bird flying")
    }


}