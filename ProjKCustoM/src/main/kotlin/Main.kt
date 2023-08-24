fun main(args: Array<String>) {
    print("Informe o custo de fábrica: ")
    val custoFabrica : Double = readln().toDouble()

    // val distribuidor : Double = 0.28
    // val impostos : Double = 0.45
    // val custoConsumidor : Double = custoFabrica + custoFabrica * 0.73
    
    val custoConsumidor : Double = custoFabrica * 1.73

    println("\n\nDados de venda do veículo " +
            "\nCusto de fábrica: $custoFabrica" +
            "\nCusto ao consumidor: $custoConsumidor")
}
