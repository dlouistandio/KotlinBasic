package specialClassNCollection

//Nested class adalah kita bisa membuat class didalam class
class House {
//    House sebagai outer class dan Room sebagai member class.
    class Room {
        val buildingArea = 100
        val totalRooms = 4
        fun measureRoomArea() {
            print(buildingArea/totalRooms)
        }
    }
}

//class House {
//    // Properti outer class
//    val buildingArea = 100
//    class Room {
//
//        val totalRooms = 4
//        fun measureRoomArea() {
//            // Member class tidak dapat mengakses properti pada outer class
//            print(buildingArea/totalRooms)
//        }
//    }
//}

fun main() {
    val room = House.Room()
}