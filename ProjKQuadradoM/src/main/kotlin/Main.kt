fun main(args: Array<String>) {
    print("Informe um número inteiro: ")
    val inteiro : Int = readln().toInt()

    val quadrado : Int = inteiro * inteiro
    // val quadrado : Double = Math.pow(inteiro.toDouble())

    println("\nO quadrado de $inteiro é = $quadrado")
}