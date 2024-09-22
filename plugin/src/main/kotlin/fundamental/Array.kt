package fundamental

fun main() {
    val array = arrayOf(1, 3, 5, 7)

//    Kita bisa dapat memasukkan nilai dengan berbagai jenis tipe data ke dalam arrayOf()
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

    /*
    Bisa membuat Array dengan tipe data primitif
    intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray
    */

    val intArray = intArrayOf(1, 3, 5, 7)
    print(intArray[2])

//    Kita bisa merubah index dalam array
    val changeArray= intArrayOf(1, 3, 5, 7)
    intArray[2] = 11

    print(intArray[2])
}