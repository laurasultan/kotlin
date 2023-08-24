fun main(args: Array<String>) {
    print("Digite um número real: ")
    val inteiro : Int = readln().toInt()

    if (inteiro % 2 == 0) {
        println("\n$inteiro é um número par")
    }; if (inteiro == 0) {
        println("\nNulo")
    } else {
        println("\n$inteiro é um número ímpar")
    }
}