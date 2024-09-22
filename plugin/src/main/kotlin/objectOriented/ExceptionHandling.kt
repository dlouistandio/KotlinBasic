package objectOriented

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

//    Try-Catch
    /*
    Dengan menuliskan kode dalam blok try, kode kita menjadi terproteksi dari exception.
    Jika terjadi exception maka program tidak akan terhenti atau crash, namun akan dilempar menuju blok catch.
    Di sana kita dapat menuliskan sebuah kode alternatif untuk menampilkan pesan eror atau yang lainnya.
    */
    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }
}

//Try-Catch-Finaly
/*
 finally akan dieksekusi setelah program keluar dari blok try ataupun catch. Bahkan finally juga tereksekusi ketika terjadi exception yang tidak terduga.
 Exception tidak terduga terjadi ketika kita menggunakan NullPointerException pada catch namun exception yang terjadi adalah NumberFormatException.
*/
fun tryCatchFinaly(){
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String
    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue)
    }
}

fun multipleCatch(){
//    try{
//        // Block try, menyimpan kode yang membangkitkan exception
//    } catch (e: NullPointerException) {
//        // Block catch akan terpanggil ketika terjadi NullPointerException.
//    } catch (e: NumberFormatException) {
//        // Block catch akan terpanggil ketika terjadi NumberFormatException.
//    } catch (e: Exception) {
//        // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
//    }
//    finally {
//        // Block finally akan terpanggil setelah keluar dari block try atau catch
//    }

    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
    /*
    Output kode di atas menjelaskan bahwa blok catch dengan parameter NullPointerException terpanggil.
    Sebabnya, pada variabel someStringValue kita menetapkan null sebagai nilainya.
    Berbeda ketika kita menginisialisasi nilai someStringValue dengan nilai “12.0” maka exception yang akan terjadi adalah NumberFormatException dengan begitu blok catch
    kedua yang akan terpanggil dan akan menghasilkan output sebagai berikut: Catch block NumberFormatException terpanggil!
    Namun jika kedua exception tersebut tidak terjadi, dalam arti nilai someStringValue berhasil diubah dalam bentuk Integer,
    maka output yang dihasilkan adalah nilai dari Integernya tersebut. Contohnya, saat nilai someStringValue diinisialisasi dengan nilai “12.”
    */
}