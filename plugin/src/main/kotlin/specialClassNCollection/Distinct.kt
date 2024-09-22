package specialClassNCollection

// Distinct digunakan untuk membandingkan setiap item tanpa menggunakan iterasi
fun main() {
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()
    println(distinct)


    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    /*
    fungsi distinct() bisa langsung dipanggil dari objek collection. Kita juga bisa menggunakannya pada collection dengan tipe parameter seperti data class
    */
    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

//    Misal kita ingin menyaring item yang memiliki panjang sama, kita bisa melakukannya seperti berikut
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinctBy = text.distinctBy {
        it.length
    }

    println(distinctBy)

//    fungsi distinct() tidak dapat digunakan pada object Map Collection.
}

data class Item(val key: String, val value: Any)