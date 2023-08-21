fun main(args: Array<String>) {
    val x : Int
    val y : Double

    x = 10
    y = 15.5

    val z : Double = x + y

    print("A soma entre $x e $y é: $z")
}

----------------------------------------------------------------------------------

fun main() {
    print("Informe o valor de x:")
    val x = readLine()?.toIntOrNull()

    print("Informe o valor de y: ")
    val y = readLine()?.toDoubleOrNull()

//     if (x == null || y == null) {
//         println("Informe valores válidos")
//         return
//     }

    val soma = x + y
    val sub = x - y
    val mult = x * y
    val div = x / y
    val mod = x % y

    println("A soma entre $x e $y é: $soma\n")
    println("A subtração entre $x e $y é: $sub\n")
    println("A multiplicação entre $x e $y é: $mult\n")
    println("A divisão entre $x e $y é: $div\n")
    println("A módulo de $x e $y é: $mod\n")
}

----------------------------------------------------------------------------------

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Informe o valor de x: ")
    val x = scanner.nextInt()

    print("Informe o valor de y: ")
    val y = scanner.nextDouble()

    val soma = x + y
    val sub = x - y
    val mult = x * y
    val div = x / y
    val mod = x % y
    
//     val div = if (y != 0) x / y else Double.POSITIVE_INFINITY
//     val mod = if (y != 0) x % y else Double.NaN

    println("A soma entre $x e $y é: $soma\n")
    println("A subtração entre $x e $y é: $sub\n")
    println("A multiplicação entre $x e $y é: $mult\n")
    println("A divisão entre $x e $y é: $div\n")
    println("A módulo de $x e $y é: $mod\n")
}
