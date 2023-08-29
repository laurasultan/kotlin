fun main(args: Array<String>) {
    print("\nInforme os dados do aluno\n" +
            "Nome: ")
    val nome : String = readln()

    print("Nota 1: ")
    val nota1 : Double = readln().toDouble()

    print("Nota 2: ")
    val nota2 : Double = readln().toDouble()

    print("Frequência: ")
    val frequencia : Int = readln().toInt()

    val media = (nota1 + nota2) / 2

    print("Situação: ")
    val situacao : String

    if (media >= 6 && frequencia >= 75) {
        situacao = "Aluno aprovado"
    } else if (media <= 6 && frequencia >= 75) {
        situacao = "Aluno aprovado por frequência e reprovado por média"
    } else if (media >= 6 && frequencia < 75) {
        situacao = "Aluno aprovado por média e reprovado por frequência"
    } else {
        situacao = "Aluno reprovado"
    }

    println("\n\nDados do aluno\n" +
            "Nome: $nome\n" +
            "Nota 1: $nota1\n" +
            "Nota 2: $nota2\n" +
            "Frequência: $frequencia\n" +
            "Média final: $media\n" +
            "Situação: $situacao")
}