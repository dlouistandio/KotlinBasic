package specialClassNCollection

/*
Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
Ini akan berguna ketika Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection.
Kita bisa mendeklarasikan sebuah Set dengan fungsi setOf
*/

fun main(){
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    val numbers = setOf("one", "two", "three")
    val numbers2 = setOf("three", "four")
    println(integerSet)

    /*
    Kita juga dapat melakukan pengecekan apakah sebuah nilai ada di dalam Set dengan menggunakan kata kunci in.
    */
    print(5 in integerSet)

    val setC = setOf(1, 5, 7)

//    Gunakanlah union untuk membuat sebuah set baru dengan mengambil semua data dari kedua set.
    val union = integerSet.union(setC)

//    Gunakanlah intersect untuk membuat sebuah set baru dengan nilai yang sama dari kedua set.
    val intersect = integerSet.intersect(setC)

//    Gunakanlah substract untuk membuat set baru dengan nilai-nilai yang tidak ada didalam set yang ditentukan.
    val substract = integerSet.subtract(setC)


/*
Berbeda dengan kasus di atas, di Kotlin tidak tersedia untuk mencari nilai symmetric difference.
Anda perlu mencari secara manual nilai dalam semua set, tetapi untuk nilai yang sama tidak dimasukkan ke dalam set baru tersebut.
*/
    // merge differences
    println((numbers - numbers2) union (numbers2 - numbers))


    println(union)
    println(intersect)
}