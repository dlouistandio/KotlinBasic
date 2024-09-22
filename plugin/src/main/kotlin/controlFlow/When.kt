package controlFlow

fun main() {
    val value = 20

//    when akan mencocokan semua argumen yang berada di setiap branch secara berurutan sampai salah satu kondisi terpenuhi
    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
//        Kita bisa menambahkan else ketika semua branch tidak memenuhi kondisi
        else -> println("value cannot be reached")
    }

    val stringOfValue = when (value) {
//        Bisa menggunakan {} jika dalam satu branch memiliki lebih dari satu kode yg ditulis
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    val anyType : Any = 100L
//    When juga bisa memeriksa type data menggunakan is atau !is
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
}