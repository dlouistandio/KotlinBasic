package specialClassNCollection

//Data class adalah sebuah kelas yang tidak memiliki logika apapun dan juga tidak memiliki fungsionalitas lain selain menangani data.
data class User(val name : String, val age : Int)

/*
Hanya dengan satu baris kode di atas, kompiler akan secara otomatis menghasilkan constructor, toString(), equals(), hashCode(), copy() dan juga fungsi componentN().
Beberapa hal yang perlu diperhatikan dalam membuat sebuah data class adalah:
Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;
Semua konstruktor utama perlu dideklarasikan sebagai val atau var;
Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
*/

class UserExample(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int){
    //    Ketika mempunyai data yang sangat kompleks, kita juga bisa menerapkan sebuah behaviour di dalam data class
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val user = UserExample("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

/*
dengan data class kita bisa langsung melihat informasi didalam data class
karena data class secara otomatis menghasilkan fungsi toString() di dalamnya
*/
    println(user)
//    oo.User@4d7e1886
    println(dataUser)
//    DataUser(name=nrohmen, age=17)

    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

//    Data class adalah ia sudah memiliki fungsi equals() secara otomatis.
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

//    Data class juga memungkinkan kita untuk menyalin sebuah objek dengan sangat mudah hanya dengan memanfaatkan fungsi copy()
    val dataUser4 = dataUser.copy()
    println(dataUser4)

//    Dengan fungsi componentN() yang ada pada data class, kita bisa menguraikan sebuah objek menjadi beberapa properti yang dimilikinya
    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old")

//    Cara mengakses fungsi pada data class
    dataUser.intro()
}