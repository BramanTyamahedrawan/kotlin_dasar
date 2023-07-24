const val APP = "Kotlin Dasar" // variable constant
const val VERSION = "0.0.1" // variable constant

fun main() {
    // 1. Jenis Variable yang pertama
    var firstName = "Braman" // var untuk variabel yang nilainya dapat diubah
    val lastName = "Tyamahendrawan" // val untuk variabel yang nilainya tidak dapat diubah

    print("Nama saya adalah $firstName $lastName\n")
    print("----------------------------------\n")

    // Mengubah nilai variabel firstName
    print("Setelah diubah nilai variabel firstName\n")
    firstName = "Bram"

    print("Nama saya adalah $firstName $lastName\n")

    // 2. Jenis Variable yang kedua
    // variable yang memiliki nilai awal (null)
    var name: String? = null // tanda (?) untuk mengizinkan variabel bernilai null
    println(name)
    println(name?.length) // tanda (?) untuk mengizinkan variabel bernilai null

    // 3. Jenis Variable yang ketiga
    // variable constant
    println(APP) // memanggil variable constant
    println(VERSION) // memanggil variable constant
}
