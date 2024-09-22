package kotlinGeneric

/*
 Nilai dari tipe parameter tersebut bisa dikonsumsi dengan menjadikannya sebagai tipe argumen
 untuk setiap fungsi yang ada di dalam kelas tersebut dan tidak untuk diproduksi
*/

interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

open class BinatangContravariant
class KucingContra : BinatangContravariant()

class PenjagaKandang<in T : BinatangContravariant> {
    fun urusKandang(hewan: T) {
        // Melakukan sesuatu dengan kandang yang berisi hewan
    }
}

val penjagaBinatang: PenjagaKandang<BinatangContravariant> = PenjagaKandang<BinatangContravariant>()
val penjagaKucing: PenjagaKandang<KucingContra> = penjagaBinatang // Contravariant, dapat di-substitute
