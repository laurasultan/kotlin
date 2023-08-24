fun main(args: Array<String>) {
    print("Informe seu salário fixo: ")
    val salarioFixo : Double = readln().toDouble()

    print("Informe o valor das vendas: ")
    val valorVendas : Double = readln().toDouble()

    val comissao : Double = valorVendas + valorVendas * 0.04

    val salarioFinal : Double = salarioFixo + comissao

    println("\nComissão: $comissao")
    println("Salário final: $salarioFinal")
}