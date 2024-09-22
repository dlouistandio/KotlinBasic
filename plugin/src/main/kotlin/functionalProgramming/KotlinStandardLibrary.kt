package functionalProgramming

class Person(var name: String, var age: Int)


/*
Scope Function
Kotlin standard library memiliki beberapa fungsi yang tujuan utamanya adalah bagaimana menuliskan logika kode di dalam konteks dari sebuah objek.
Dalam menggunakan fungsi tersebut, kita akan memanfaatkan lambda expression yang memiliki ruang lingkupnya sendiri yang dapat mengakses konteks dari sebuah objek.
Fungsi inilah yang dinamakan sebagai scope function. Beberapa fungsi yang berada di dalamnya antara lain let, run, with, apply, dan also.
*/

/*
Context Object
kita perlu mengetahui terlebih dahulu cara mengakses konteks sebuah objek dari dalam lambda yang menjadi bagian dari scope function.
Terdapat 2 (dua) cara, yaitu: diakses sebagai lambda receiver (this) dan lambda argumen (it).
*/
/*
Lambda receiver (this)
Beberapa fungsi yang menggunakan lambda receiver adalah run, with, dan apply.
Ketika ingin mengakses konteks dari sebuah objek, kita bisa saja tidak menuliskan atau menghilangkan kata kunci this
Cara ini memiliki kekurangan, yaitu kita tidak dapat membedakan objek receiver dengan objek yang berada dari luar lingkup fungsi tersebut.
Alih-alih cara ini lebih ditujukan untuk operasi objek itu sendiri, seperti memanggil fungsi dan inisialisasi nilai dari anggota yang menjadi bagian dari objek tersebut.
*/
/*
Lambda argument (it)
Fungsi yang menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah fungsi let dan also. Berbeda dengan lambda receiver,
nilai dari argumen tersebut dapat kita gunakan untuk diproduksi atau diinisialisasikan untuk variabel lain.
*/

fun main() {
    // apply: Menginisialisasi objek dan mengatur propertinya, kemudian mengembalikan objek tersebut
    val personApply = Person("John", 25).apply {
        println("apply: Initializing $name, age $age")
    }

    // also: Melakukan tindakan tambahan pada objek dan mengembalikan objek tersebut
    val personAlso = Person("Jane", 30).also {
        println("also: Initializing ${it.name}, age ${it.age}")
    }

    // let: Melakukan operasi pada objek dan mengembalikan hasil operasi tersebut
    val personLet = Person("Bob", 22).let {
        println("let: Initializing ${it.name}, age ${it.age}")
        "Result: ${it.name} is ${it.age} years old" // return value
    }
    println("let result: $personLet")

    // run: Menjalankan blok kode pada objek dan mengembalikan hasil blok kode tersebut
    val personRun = Person("Alice", 28).run {
        println("run: Initializing $name, age $age")
        "Result: $name is $age years old" // return value
    }
    println("run result: $personRun")

    // with: Menggunakan objek sebagai receiver untuk blok kode dan mengembalikan hasil blok kode tersebut
    val personWithResult = with(Person("Charlie", 35)) {
        println("with: Initializing $name, age $age")
        "Result: $name is $age years old" // return value
    }
    println("with result: $personWithResult")

    /*
    apply dan also akan mengembalikan sebuah context object.
    let, run, dan with akan mengembalikan sebuah hasil berupa lambda.
    */
}