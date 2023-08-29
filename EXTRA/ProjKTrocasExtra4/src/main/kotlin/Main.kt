fun main(args: Array<String>) {
    print("\nInforme 3 número inteiros\n" +
            "Primeiro número: ")
    val numero1 : Int = readln().toInt()

    print("Segundo número: ")
    val numero2 : Int = readln().toInt()

    print("Terceiro número: ")
    val numero3 : Int = readln().toInt()

    val a : Int = numero2
    val b : Int = numero3
    val c : Int = numero1

    println("\nPrimeiro número = $a\n" +
            "Segundo número = $b\n" +
            "Terceiro número = $c")
}