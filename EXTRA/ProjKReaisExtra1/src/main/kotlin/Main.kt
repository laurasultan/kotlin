fun main(args: Array<String>) {
    print("\nInforme o valor de A (número real): ")
    val a : Double = readln().toDouble()

    print("Informe o valor de B (número real): ")
    val b : Double = readln().toDouble()

    print("Informe o valor de C (número real): ")
    val c : Double = readln().toDouble()

    val resultado : Double = (a + b) * (b + c)

    println("\nO resultado do cálculo é $resultado")
}