fun main(args: Array<String>) {
    print("\nInforme os dados do aluno\n" +
            "Nome: ")
    val nome : String = readln()

    print("Nota 1: ")
    val nota1 : Float = readln().toFloat()

    print("Nota 2: ")
    val nota2 : Float = readln().toFloat()

    print("Frequência: ")
    val frequencia : Float = readln().toFloat()

    val media : Float = (nota1 + nota2) / 2

    var situacao : String = "Aluno reprovado"

    // if (if) == && ----- else (if) == ||
    if (media >= 6) {
        if (frequencia >= 75) {
            situacao = "Aluno aprovado"
        } else {
            situacao = "Aluno aprovado por média e reprovado por frequência"
        }
    } else if (!(frequencia < 75)) {
            situacao = "Aluno aprovado por frequência e reprovado por média"
    }

    println("\nDados do aluno\n" +
            "Nome: $nome\n" +
            "Nota 1: $nota1\n" +
            "Nota 2: $nota2\n" +
            "Frequência: $frequencia\n" +
            "Média: $media\n" +
            "Situação: $situacao")
}