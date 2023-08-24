fun main(args: Array<String>) {
    print("Insira seu nome: ")
    val nome : String = readln()

    print("Insira seu RA: ")
    val ra : String = readln()

    print("Informe sua nota N1: ")
    val nota1 : Double = readln().toDouble()

    print("Informe sua nota N2: ")
    val nota2 : Double = readln().toDouble()

    val mediaFinal : Double = (nota1 + nota2) / 2

    println("\nNome: $nome")
    println("RA: $ra")
    println("Nota N1: $nota1")
    println("Nota N2: $nota2")
    println("Média final: $mediaFinal")

    if (mediaFinal >= 6.0) {
        println("\nAprovada")
    } else {
        println("\nReprovada")
    }
}