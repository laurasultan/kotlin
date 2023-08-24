fun main(args: Array<String>) {
    print("Informe o salário base: ")
    val salarioBase : Float = readln().toFloat()

    // val gratificacao : Float = salarioBase * 0.05f
    // val imposto : Float = gratificacao - gratificacao * 0.07f

    val salarioLiquido : Float = salarioBase * 1.05f * 0.93f

    println("\nSalário a receber: $salarioLiquido")
}

// desconto = 0.
// acrescimo = 1.
