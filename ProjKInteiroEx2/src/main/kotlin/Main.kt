fun main(args: Array<String>) {
    print("\nInforme um número inteiro: ")
    val inteiro : Int = readln().toInt()

    var resultado : String = "Nulo"

    if (inteiro % 2 == 0 && inteiro > 0) {
        resultado = "Par e positivo"
    } else if (inteiro % 2 == 0 && inteiro < 0) {
        resultado = "Par e negativo"
    } else if (inteiro % 2 != 0 && inteiro > 0) {
        resultado = "Ímpar e positivo"
    } else if (inteiro % 2 != 0 && inteiro < 0) {
        resultado = "Ímpar e negativo"
    }

    println("\nO número $inteiro é: $resultado")
}