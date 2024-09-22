package controlFlow

fun main() {
//    For dapat digunakan pada Ranges, Collections, Arrays dan apa pun yang menyediakan iterator
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }


//    Kita bisa juga menambahkan step yang akan mengembalikan nilai baru dengan jarak nilai sebelumnya adalah 3
    val rangesStep = 1.rangeTo(10) step 3
    for (i in rangesStep ){
        println("value is $i!")
    }

//    Kita juga dapat mengakses indeks untuk setiap elemen yang ada pada ranges dengan memanfaatkan fungsi withIndex()
    val rangesWithIndex = 1.rangeTo(10) step 3
    for ((index, value) in rangesWithIndex.withIndex()) {
        println("value $value with index $index")
    }

/*
 forEach , kita tidak perlu lagi menggunakan for secara terpisah seperti sebelumnya.
 Ia akan otomatis melakukan perulangan pada setiap item dari variabel tersebut sampai akhir.
 Untuk mendapatkan nilainya, kita definisikan variabel value
*/
    val rangesForEach = 1.rangeTo(10) step 3
    rangesForEach.forEach { value ->
        println("value is $value!")
    }
}