fun main(args: Array<String>) {
    print("Informe o custo de fábrica: ")
    val custoFabrica : Double = readln().toDouble()

    val distribuidor : Double = 0.28
    val impostos : Double = 0.45

    val custoConsumidor : Double = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45)

    println("\nCusto de fábrica: $custoFabrica")
    println("Custo ao consumidor: $custoConsumidor")
}