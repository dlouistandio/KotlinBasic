package specialClassNCollection

//Map sebuah collection yang dapat menyimpan data dengan format key-value.

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Jakarta"])

/*
Kita bisa merubah map menggunakan mutablemap dan gunakan put untuk memasukan key dan value namun tidak disarankan
Apabila terdapat sebuah mutable collection yang diubah oleh lebih dari 1 proses, hasil nya akan sulit untuk diprediksi
*/
}