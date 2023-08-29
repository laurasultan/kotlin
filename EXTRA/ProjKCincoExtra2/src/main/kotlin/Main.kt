fun main(args: Array<String>) {
    print("\nEscolha 5 números reais\n" +
            "Valor 1: ")
    val valor1 : Double = readln().toDouble()

    print("Valor 2: ")
    val valor2 : Double = readln().toDouble()

    print("Valor 3: ")
    val valor3 : Double = readln().toDouble()

    print("Valor 4: ")
    val valor4 : Double = readln().toDouble()

    print("Valor 5: ")
    val valor5 : Double = readln().toDouble()

    val soma : Double = valor1 + valor2 + valor3 + valor4 + valor5
    val produto : Double = valor1 * valor2 * valor3 * valor4 * valor5
    val media : Double = (valor1 + valor2 + valor3 + valor4 + valor5) / 5

    println("\nO resultado da soma é $soma\n" +
            "O resultado do produto é $produto\n" +
            "O resultado da média é $media")
}