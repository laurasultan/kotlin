fun main(args: Array<String>) {
    print("\nInforme um número inteiro: ")
    val numero : Int = readln().toInt()

    var resposta : String = "Nulo"

    if (numero > 0) {
        if (numero % 2 == 0) {
            resposta = "Par e positivo"
        } else {
            resposta = "Ímpar e positivo"
        }
    } else if (numero % 2 != 0) {
            resposta = "Ímpar e negativo"
        } else if (numero != 0) {
            resposta = "Par e negativo"
        }

    println("\nO número $numero é: $resposta")
}