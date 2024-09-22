package specialClassNCollection

//Penggunaan Inner Class memungkinkan kita untuk mengakses member (property dan method) dari outer class-nya.
class HouseInner {
    // Properti outer class
    val buildingArea = 100
    val totalRooms = 4

    /*
    Untuk membuat inner class, Anda hanya perlu menambahkan keyword inner pada member class.
    Dengan begitu, ia dapat mengakses properti yang ada di outer class.
    */
    inner class Room {
        // Properti atau anggota inner class
        val totalRooms = 4
        fun measureRoomArea() {
            // Inner class dapat mengakses properti atau anggota outer class
            print(buildingArea/this@HouseInner.totalRooms)
            /*
            Jika outer class dan inner class memiliki nama property yang sama.
            Pada dasarnya, jika Anda hanya memanggil nama property, Kotlin akan mengambil property dari inner class terlebih dahulu.
            Namun, apabila ingin mengambil property dari outer class, Anda bisa menggunakan qualified this this@class.namaProperti
            */
        }
    }
}

fun main() {
    val house = HouseInner()
    val room = house.Room()
    room.measureRoomArea()
}