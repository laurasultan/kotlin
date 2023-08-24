fun main(args: Array<String>) {
    print("Digite um número real: ")
    val real : Double = readln().toDouble()

    if (real < 0) {
        println("\n$real é um número negativo")
    }; if (real > 0) {
        println("\n$real é um número positivo")
    } else {
        println("\nNulo")
    }
}