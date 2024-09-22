import kotlinx.coroutines.*

//Menggunakan fungsi runBlocking untuk memulai coroutine utama dan launch untuk menjalankan coroutine baru
fun main() = runBlocking{
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}