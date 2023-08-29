fun main(args: Array<String>) {
    print("\nInforme o valor do salário mínimo: ")
    val salarioMinimo : Float = readln().toFloat()

    print("Informe o valor do salário do funcionário: ")
    val salarioFuncionario : Float = readln().toFloat()

    val quantidadeSalario : Float = salarioFuncionario / salarioMinimo

    println("\nO funcionário recebe o equivalente a $quantidadeSalario salários mínimos.")
}