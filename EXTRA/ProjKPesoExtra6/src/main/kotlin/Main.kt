fun main(args: Array<String>) {
    print("\nInforme seu peso: ")
    val peso : Float = readln().toFloat()

    val engordar : Float = peso * 1.15f
    val emagrecer : Float = peso * 0.80f

    println("\nPeso, após engordar 15% = $engordar\n" +
            "Peso, após emagrecer 20% = $emagrecer")
}