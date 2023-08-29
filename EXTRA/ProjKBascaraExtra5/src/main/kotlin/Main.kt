fun main(args: Array<String>) {
    print("\nInforme os valores da equação\n" +
            "A = ")
    val a : Double = readln().toDouble()

    print("B = ")
    val b : Double = readln().toDouble()

    print("C = ")
    val c : Double = readln().toDouble()

    val delta : Double = (b * b) - (4 * a * c)

    if (delta < 0) {
        println("\nA equação não tem raízes reais.")
    } else if (delta == 0.toDouble()) {
        val raiz = - b / (2 * a)
        println("\nA equação tem apenas uma raíz: $raiz")
    } else {
        val x1 = (- b + Math.sqrt(delta)) / (2 * a)
        val x2 = (- b - Math.sqrt(delta)) / (2 * a)
        println("\nA quação tem duas raízes reais: \n" +
                "X' = $x1 e X'' = $x2")
    }
}