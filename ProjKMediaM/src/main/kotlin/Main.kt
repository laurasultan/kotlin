fun main(args: Array<String>) {
    print("Informe os dados da aluna: \n" +
            "Nome: ")
    val nome : String = readln()

    print("RA: ")
    val ra : Long = readln().toLong()

    print("Nota 1: ")
    val nota1 : Float = readln().toFloat()

    print("Nota 2: ")
    val nota2 : Float = readln().toFloat()

    val media = (nota1 + nota2) / 2

    print("Situação: ")
    val situacao : String

    if (media >= 6) {
        situacao = "Aprovada"
    } else {
        situacao = "Reprovada"
    }

    println("\n\nDados da aluna\n" +
            "Nome: $nome\n" +
            "RA: $ra\n" +
            "Nota 1: $nota1\n" +
            "Nota 2: $nota2\n" +
            "Média final: $media\n" +
            "Situação: $situacao")
}
