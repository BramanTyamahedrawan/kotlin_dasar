fun main() {
    var name: String = "Braman Tyamahendrawan" // tanda ("") untuk teks satu baris
    var address: String =
    // tanda (""") untuk teks lebih dari satu baris dengan default margin |
    """ 
        |Jl. Flamboyan kec. Pare
        |kab. Kediri, Jawa Timur
        |Indonesia
    """.trimMargin() // trimMargin() untuk menghilangkan margin

    println("String: " + name + "\n" + address)

    // String template
    println()
    var firstName: String = "Braman"
    var lastName: String = "Tyamahendrawan"
    var fullName: String = "$firstName $lastName" // tanda ($) untuk menggabungkan string
    println("String template: " + fullName)
}
