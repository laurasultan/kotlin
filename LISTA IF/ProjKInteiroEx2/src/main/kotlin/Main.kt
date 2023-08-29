fun main(args: Array<String>) {
    print("\nInforme um número inteiro: ")
    val inteiro : Int = readln().toInt()

    if (inteiro == 0) {
        println("Nulo")
    } else {
        if (inteiro % 2 == 0) {
            if (inteiro > 0) {
                println("Par e positivo")
            } else {
                println("Par e negativo")
            }
        } else {
            if (inteiro > 0) {
                println("Ímpar e positivo")
            } else {
                println("Ímpar e negativo")
            }
        }
    }
}