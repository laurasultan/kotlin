fun main(args: Array<String>) {
    print("Informe o salário base: ")
    val salarioBase : Double = readln().toDouble()

    val gratificacao : Double = salarioBase + salarioBase * 0.05
    val imposto : Double = gratificacao - gratificacao * 0.07

    println("\nSalário a receber: $imposto")
}