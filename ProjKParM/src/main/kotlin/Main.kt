fun main(args: Array<String>) {
    print("Digite um número real: ")
    val inteiro : Int = readln().toInt()

    var resultado : String = "Par"
    // var = variável mutável

    if (inteiro == 0) {
        resultado = "Nulo"
    } else if (inteiro % 2 != 0) {
        resultado = "Ímpar"
    }

    println("\nO número $inteiro é: $resultado")
}

/*

val resutado : String
else {
    resultado = "Par"
}

*/
