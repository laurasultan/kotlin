fun main(args: Array<String>) {
    print("Informe o nome do produto: ")
    val nome : String = readln()

    print("Informe a quantidade do produto: ")
    val quantidade : Int = readln().toInt()

    print("Informe o valor unitário do produto: ")
    val valorUnitario : Double = readln().toDouble()

    val valorTotal : Double = quantidade * valorUnitario
    val acrescimo : Double = valorTotal + valorTotal * 0.035
    val desconto : Double = valorTotal - valorTotal * 0.025

    println("\nDados do produto:")
    println("Nome: $nome")
    println("Quantidade: $quantidade")
    println("Valor unitário: $valorUnitario")
    println("Valor total: $valorTotal")
    println("Valor total com 3,5% de acréscimo: $acrescimo")
    println("Valor total com 2,5% de desconto: $desconto")
}