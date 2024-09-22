package kotlinGeneric


/*
Ketika kita menandai sebuah tipe parameter dengan kata kunci out, nilai dari tipe parameter tersebut hanya bisa diproduksi seperti menjadikanya sebagai return type.
Serta tidak dapat dikonsumsi seperti menjadikannya sebagai tipe argumen untuk setiap fungsi di dalam kelas tersebut.
*/
interface ListCovariant<out E> : Collection<E> {
    operator fun get(index: Int): E
}

open class Binatang
class Kucing : Binatang()

class Kandang<out T : Binatang>(private val hewan: T) {
    fun dapatkanHewan(): T {
        return hewan
    }
}

val kandangKucing: Kandang<Kucing> = Kandang(Kucing())
val kandangBinatang: Kandang<Binatang> = kandangKucing // Covariant, dapat di-substitute