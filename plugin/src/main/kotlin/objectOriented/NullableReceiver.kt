package objectOriented

fun main() {
    val value: Int? = null

    println(value.slice)
    println(value.slice2)
    println(value?.slice3)
}

/*
kita bisa juga mendeklarasikan sebuah extension dengan nullable receiver type.
Alhasil, extension tersebut bisa dipanggil pada objek yang bahkan nilainya null.
*/
/*
kapan kita membutuhkannya? Tentunya jika kita mempunyai sebuah objek yang bernilai null.
Saat kita tidak menetapkannya dengan nullable receiver type, maka kita perlu memeriksa apakah objek tersebut bernilai null atau tidak?
Bisa juga dengan menggunakan operator safe call setiap kali extension tersebut dipanggil
*/
val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

val Int?.slice2: Int
    get() = this?.div(2) ?: 0

val Int.slice3: Int
    get() = this.div(2)