package specialClassNCollection

/*
kita bisa dengan mudah melakukan perhitungan setiap nilai yang berada di dalam sebuah
collection tanpa harus melakukan iterasi item tersebut satu-persatu menggunakan fungsi fold().
*/


fun main(){

    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    /*
    foldRight() akan melakukan proses iterasi dari indeks terakhir dan posisi dari argumen pada lambda expression nya pun berbeda,
    di mana argumen item berada pada posisi pertama dan argumen current berada pada posisi kedua
    */
    val foldRight = numbers.foldRight(2) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")
    println("Fold result: $foldRight")
}
