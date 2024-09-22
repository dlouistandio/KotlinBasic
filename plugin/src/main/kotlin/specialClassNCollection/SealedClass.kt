package specialClassNCollection

/*
Sealed Class sebenarnya mirip dengan Enum Class, tetapi jauh lebih fleksibel.
Berbeda dengan Enum Class yang hanya dapat berisi satu objek (instance) yang sama per class,
Sealed Class dapat berisi beberapa objek yang berbeda-beda untuk memberikan informasi lebih.
*/

sealed class Result {
    data class Success(val data: Any) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()
}

fun main() {
    val result: Result = Result.Error("Oops!")
    /*
    Hal yang perlu diperhatikan ketika menggunakan Sealed Class adalah ia bersifat exhaustive.
    Artinya, Anda harus menangani setiap kondisi yang ditentukan pada Sealed Class.
    */
    when (result) {
        //jika salah satu kondisi dihapus, kode akan error
        is Result.Success -> {
            println("Success: ${result.data}")
        }
        is Result.Error -> {
            println("Error: ${result.message}")
        }
        is Result.Loading -> {
            println("Loading...")
        }
    }
}