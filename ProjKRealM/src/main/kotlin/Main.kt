fun main(args: Array<String>) {
    print("\nDigite um número real: ")
    val real : Double = readln().toDouble()

    var resultado : String = "Nulo"
    // var = variável mutável

    if (real > 0) {
        resultado = "Positivo"
    } else if (real < 0) {
        resultado = "Negativo"
    }
}
