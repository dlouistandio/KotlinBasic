package controlFlow

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
  //    Disini jika i == null maka loop tetap dilanjutkan
        if (i == null) continue
        print(i)
    }

    for (i in listOfInt) {
 //    Disini jika i == null maka loop tidak dilanjutkan
        if (i == null) break
        print(i)
    }

    /*
    break yang sudah ditandai dengan @label akan dilompati ke titik awal proses perulangan yang sudah ditandai dengan @label.
    break akan menghentikan proses perulangan terluar dari dalam proses perulangan, di mana break tersebut dipanggil.
    */
    loop@ for (i in 1..10) {
        println("Outside Loop")
        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}