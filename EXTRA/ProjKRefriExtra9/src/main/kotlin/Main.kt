fun main(args: Array<String>) {
    print("\nInforme a quantidade de latas vendidas: ")
    val latas : Int = readln().toInt()

    print("Informe a quantidade de refri de 600ml: ")
    val refri600 : Int = readln().toInt()

    print("Informe a quantidade de refri de 2 litros: ")
    val refri2 : Int = readln().toInt()

    val litrosTotal : Int = latas + refri600 + refri2
    val valorTotal : Float = (latas * 1.20f) + (refri600 * 1.80f) + (refri2 * 2.80f)

    println("\nTotal de litros vendidos: $litrosTotal\n" +
            "Valor total vendido: R$ $valorTotal")
}