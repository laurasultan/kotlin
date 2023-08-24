fun main(args: Array<String>) {
    print("Informe o nome do produto: ")
    val nome : String = readln()

    print("Informe a quantidade do produto: ")
    val quantidade : Int = readln().toInt()

    print("Informe o valor unitário do produto: ")
    val valorUnitario : Float = readln().toFloat()

    val valorTotal : Float = quantidade * valorUnitario
    val acrescimo : Float = valorTotal * 0.035f
    val desconto : Float = valorTotal * 0.975f    // 0.025

    println("\n\nDados do produto\n " +
            "Nome: $nome\n" +
            "Quantidade: $quantidade\n" +
            "Valor unitário: $valorUnitario\n" +
            "Valor total: $valorTotal\n" +
            "Valor total com 3,5% de acréscimo: $acrescimo\n" +
            "Valor total com 2,5% de desconto: $desconto")
}
