package specialClassNCollection

fun main() {
    /*
    Dengan sequence, operasi akan dilakukan secara vertikal atau per item, misalnya dimulai angka 1. Karena tidak memenuhi kondisi pada filter,
    operasi tidak akan dilanjutkan ke map(). Sampai dengan iterasi ke-5 akan dilakukan mapping, angka 5 akan dikalikan 2.
    Karena data pertama, ia akan ditampilkan pada konsol. Setelah itu tidak akan dilanjutkan ke iterasi berikutnya karena kondisi sudah terpenuhi.
    */
    val list = (1..10000).toList()
    val number = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)

//    Untuk membuat objek Sequence, kita bisa menggunakan fungsi yang tersedia pada standard library yaitu generateSequence().
    val sequenceNumber = generateSequence(1) { it + 1 }
    /*
    ungsi ini memiliki 2 parameter. Parameter pertama adalah item pertama yang ada di dalam collection.
    Pada contoh kode tadi, setiap item merupakan item sebelumnya ditambah 1. Fungsi generateSequence() akan membuat collection sequence secara tak terbatas.
    Alhasil, kita perlu menambahkan fungsi take() supaya program tidak mengalami infinite loop.
    */
    sequenceNumber.take(5).forEach { print("$it ") }
}