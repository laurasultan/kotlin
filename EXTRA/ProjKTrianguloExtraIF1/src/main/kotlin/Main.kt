fun main(args: Array<String>) {
    print("\nInforme as 3 medidas dos lados do triângulo\n" +
            "Lado 1: ")
    val a : Int = readln().toInt()

    print("Lado 2: ")
    val b : Int = readln().toInt()

    print("Lado 3: ")
    val c : Int = readln().toInt()

    print("\nInforme as 3 medidas dos ângulos do triângulo\n" +
            "Ângulo 1: ")
    val a1 : Int = readln().toInt()

    print("Ângulo 2: ")
    val a2 : Int = readln().toInt()

    print("Ângulo 3: ")
    val a3 : Int = readln().toInt()

    var validacaoFormaLados : String
    var validacaoTotalGraus : String
    var validacaoAngulo : String
    var resultadoLado : String = "Triângulo com lados inválidos"
    var resultadoAngulo : String = "Triângulo com ângulos inválidos"

    if (validacaoTriangulo(a, b, c)) {
        validacaoFormaLados = "Os lados formam um triângulo"
    } else {
        validacaoFormaLados = "Os lados não formam um triângulo"
    }

    if (validacaoGraus(a1, a2, a3)) {
        validacaoTotalGraus = "A soma dos ângulos equivale a 180"
    } else {
        validacaoTotalGraus = "A soma dos ângulos não equivale a 180"
    }

    if (validacaoAngulo(a1, a2, a3)) {
        validacaoAngulo = "Todos os ângulos são maiores que 0"
    } else {
        validacaoAngulo = "Um ou mais ângulos não são maiores que 0"
    }

    if (a == b && b == c && a == c) {
        resultadoLado = "Triângulo equilátero"
    } else if (a != b && b != c && a != c) {
        resultadoLado = "Triângulo escaleno"
    } else {
        resultadoLado = "Triângulo isósceles"
    }

    if (a1 > 90 || a2 > 90 || a3 > 90) {
        resultadoAngulo = "Triângulo obtusângulo"
    } else if (a1 < 90 && a2 < 90 && a3 < 90) {
        resultadoAngulo = "Triângulo ocutângulo"
    } else if (a1 == 90 || a2 == 90 || a3 == 90) {
        resultadoAngulo = "Triângulo retângulo"
    }

    println("\nValidação e tipos do triângulo\n" +
            "Lados: $validacaoFormaLados\n" +
            "Ângulos = 180: $validacaoTotalGraus\n" +
            "Ângulos > 0: $validacaoAngulo\n" +
            "Tipo (lados): $resultadoLado\n" +
            "Tipo (ângulos): $resultadoAngulo")
}

// A soma de dois lados do triângulo é maior que o terceiro lado
fun validacaoTriangulo(a: Int, b: Int, c: Int): Boolean {
    return (a + b > c) && (a + c > b) && (b + c > a)
}

// A soma dos ângulos do triângulo equivalem a 180
fun validacaoGraus(a1: Int, a2: Int, a3: Int) : Boolean {
    return (a1 + a2 + a3 == 180)
}

// Todos os ângulos do triângulo são maiores que 0
fun validacaoAngulo(a1: Int, a2: Int, a3: Int) : Boolean {
    return (a1 > 0 && a2 > 0 && a3 > 0)
}