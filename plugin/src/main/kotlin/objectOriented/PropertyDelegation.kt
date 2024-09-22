package objectOriented

import kotlin.reflect.KProperty


class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}


/*
  Dengan delegation kita dapat meminimalisir boilerplate dalam penulisan getter dan setter (jika properties menggunakan var) pada setiap kelas yang kita buat.
  Untuk mendelegasikan sebuah class kita bisa menggunakan by
  */
class Street {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}


fun main() {
    val street = Street()
    street.name = "Dicoding Miaw"
    println("Nama Hewan: ${street.name}")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")
}