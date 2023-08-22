fun main(args: Array<String>) {
    print("Informe um valor inteiro qualquer: ")
    val valor1 : Int = readln().toInt()

    print("Informe um valor númerico qualquer: ")
    val valor2 : Float = readln().toFloat()

    val soma : Float = valor1 + valor2
    val subtracao : Float = valor1 - valor2
    val multiplicacao : Float = valor1 * valor2
    val divisao : Float = valor1 / valor2
    val restoDaDivisao : Float = valor1 % valor2

    println("\n\nA soma entre $valor1 e $valor2 é: $soma")
    println("A subtração entre $valor1 e $valor2 é: $subtracao")
    println("A multiplicação entre $valor1 e $valor2 é: $multiplicacao")
    println("A divisão entre $valor1 e $valor2 é: $divisao")
    println("O resto da divisão entre $valor1 e $valor2 é: $restoDaDivisao")
}

----------------------------------------------------------------------------------

/*

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

*/
