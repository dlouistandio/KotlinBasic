import kotlinx.coroutines.*

//Job dapat diinisialisasikan menggunakan fungsi launch() maupun Job()
//menggunakan launch():
@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(1000L)
        println("Start new job!")
    }

    // Jika Anda ingin membuat sebuah job tanpa langsung menjalankannya, Anda bisa memanfaatkan CoroutineStart.LAZY

    val jobLazy = runBlocking {
        val job = launch(start = CoroutineStart.LAZY) {
            TODO("Not implemented yet!")
        }

//    Untuk memulai job menggunakan start() atau join()
//    job.join()
    /*
    Perbedaan dari keduanya adalah bahwa yang start() akan memulai job tanpa harus menunggu job tersebut selesai,
    sedangkan join() akan menunda eksekusi sampai job selesai
    */
    job.start()
    println("Other task")

    delay(2000)
//        Hanya job yang sedang aktif yang dapat dibatalkan. Anda bisa melakukannya dengan memanggil fungsi cancel()

    job.cancel(cause = CancellationException("time is up!"))
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
        /*
              CancellationException akan mengirimkan nilainya sebagai pengecualian dari job tersebut. Kita pun bisa mengakses
              nilai tersebut dengan fungsi getCancellationException. Karena getCancellationException masih tahap eksperimen,
              Anda perlu menambahkan anotasi @InternalCoroutinesAp
        */
}

//menggunakan Job():
fun JobTest() = runBlocking {
    val job = Job()
}
}

