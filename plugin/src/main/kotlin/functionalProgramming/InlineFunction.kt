package functionalProgramming

/*
perlu diketahui bahwa penggunaan Higher-Order Function memiliki dampak terhadap performa program. Hal ini karena ketika Higher-Order Function dijalankan,
di balik layar terjadi proses pembuatan instance yang banyak jika dipangil berulang-ulang.

Inline adalah fitur dalam bahasa Kotlin yang memungkinkan Anda untuk menyertakan seluruh kode dari suatu fungsi atau lambda (expression function)
pada saat kompilasi, sehingga mempercepat waktu eksekusi program.
penggunaan inline ibarat penggunaan fotocopy, Anda cukup membuat mesin fotocopy sekali dan mesin tersebut yang akan menyalin tulisan dengan mudah dan tentunya cepat.
*/
fun main(){
    printResultInline(10){ value ->
        value + value
    }
}

inline fun printResultInline(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

//Penggunakan inline juga dapat menyebabkan file binary program menjadi lebih besar dan memperlambat waktu kompilasi