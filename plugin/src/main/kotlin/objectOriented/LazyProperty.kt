package objectOriented

// Lazy property untuk membuat property yang bukan null dan menunda inisialisasi.
val nameLazy: String by lazy {
    "Dicoding Miaw"
}
fun main() {
    print(nameLazy.length)
}