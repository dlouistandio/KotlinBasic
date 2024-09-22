import kotlinx.coroutines.*

/*
coroutines berjalan di atas sebuah thread. Tentunya kita harus mengetahui thread mana yang
akan digunakan untuk menjalankan dan melanjutkan sebuah coroutine.
Untuk menentukannya kita membutuhkan sebuah base class bernama CoroutineDispatcher
*/
@OptIn(ObsoleteCoroutinesApi::class)
fun main() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}