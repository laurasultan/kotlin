fun main(args: Array<String>) {
    print("\nInforme os dados do nadador\n" +
            "Nome: ")
    val nome : String = readln()

    print("Idade: ")
    val idade : Byte = readln().toByte()

    var classificacao : String = "Não pode ser nadador, mínimo 8 anos e no máximo 60"

    if (idade >= 8 && idade <= 10) {
        classificacao = "Infantil"
    } else if (idade >= 11 && idade <=17) {
        classificacao = "Juvenil"
    } else if (idade >= 18 && idade <= 49) {
        classificacao = "Adulto"
    } else if (idade >= 50 && idade <= 60) {
        classificacao = "Tericeira idade"
    }

    println("\nDados do nadador" +
            "Nome: $nome\n" +
            "Idade: $idade\n" +
            "Classificação: $classificacao")
}