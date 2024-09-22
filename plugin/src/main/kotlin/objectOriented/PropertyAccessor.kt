package objectOriented

class zoo{
    var name: String = "Dicoding Miaw"

        /*
        Tetapi jika kita melakukan override pada fungsi getter dan juga setter , maka kita dapat menambahkan kode lain pada fungsi getter sesuai dengan kebutuhan.
        */
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main(){
    val dicodingCat = zoo()
//    Disini ${dicodingCat.name} kita melakukan getter karena tidak merubah data pada variable melainkan memanggil data
    println("Nama: ${dicodingCat.name}" )

//    Disini ${dicodingCat.name} kita melakukan setter karena  merubah data pada variable
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}