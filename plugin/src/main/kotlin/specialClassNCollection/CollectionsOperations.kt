package specialClassNCollection

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5)
    val kotlinString = listOf("Agus", "Heru", "Budi", "Bani")
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')

    /*
    kita telah menggunakan filter() untuk menyaring bilangan yang habis dibagi 2 (dua) atau biasa disebut dengan bilangan genap.
    Selain itu kita juga dapat mem-filter list berdasar hasil yang tak sesuai dengan kondisi yang diberikan.
    Caranya adalah dengan menggunakan fungsi filterNot().
    */
    val evenList = numberList.filter { it % 2 == 0 }
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    /*
    Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.
    Kita ambil contoh dari numberList yang sudah ada. Lalu kita buat collection baru yang isinya adalah hasil kali 5 (lima) dari masing-masing item sehingga
    Anda bisa menggunakan kode seperti berikut.
    */
    val multipliedBy5 = numberList.map { it * 5 }

    /*
    count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection.
    Kembali gunakan contoh numberList, kita akan menampilkan jumlah item yang ada di dalamnya.
    */
    print(numberList.count())

//  fungsi yang digunakan untuk mencari item pada sebuah collection.
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    val moreThan10 = numberList.first { it > 5 }

/*
Fungsi sum() khusus hanya bisa digunakan untuk collection yang bertipe angka.
Fungsi ini akan menjumlahkan setiap data yang ada pada collection
*/
    val total = numberList.sum()

//  sorted() digunakan untuk mengurutkan item yang ada di dalam collection. Secara default fungsi sorted() ini akan mengurutkan data secara ascending.
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()
    val ascendingSortString = kotlinString.sorted()
}