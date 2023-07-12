fun main() {
    // Integer
    var age: Int = 20
    println("Int: " + age)

    // Float
    var height: Float = 170.5f
    println("Float: " + height)

    // Literal
    var binary: Int = 0b01010100
    println("Binary: " + binary)

    // Underscore
    var balance: Long = 1_000_000_000_000L
    println("Long: " + balance)

    // Conversion
    var priceInt: Int = binary.toInt()
    println("PriceInt: " + priceInt)
}
