package objectOriented

/*
Jika akan membuat suatu objek dari sebuah kelas dan kelas tersebut memiliki primary constructor di dalamnya, kita harus mengirim nilai sesuai properti yang dibutuhkan.
Kita bisa membuat nilai default pada sebuah primary constructor, kita perlu menginisialisasi nilai pada saat kita menuliskan properti pada kelas.
*/
class fish(val name: String, val weight: Double, val age: Int, val isMammal: Boolean) //Primary Constructor

class fish2(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
//    Property class
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

//     blok init yang memungkinkan kita untuk menuliskan properti di dalam body class ketika kita menggunakan primary constructor.
    init {
//        kita dapat menggunakan keyword init kemudian inisialisasikan semua properti di dalam blok tersebut dengan parameter kelas.
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

class fish3(name: String, weight: Double, age: Int, isMammal: Boolean){
    //    Property class
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
//        kita bisa menggunakan this untuk menunjukan bawha kita menggunakan property yang ada dalam class
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }

}


fun main(){
    val dicodingCat = fish("Dicoding Miaw", 4.2, 2, true) //Membuat objek untuk kelas
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}