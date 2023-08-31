fun main(args: Array<String>) {
    print("\nInforme os dados da pessoa\n" +
            "Nome: ")
    val nome : String = readln()

    print("Idade: ")
    val idade : Byte = readln().toByte()

    var classificacao : String = "Terceira idade"

//    if (idade < 8 || idade > 60) {
//        classificacao = "Não pode ser nadador, mínimo 8 anos e máximo 60 anos"
//    } else if (idade >= 8 && idade <= 10) {
//        classificacao = "Infantil"
//    } else if (idade >= 11 && idade <= 17) {
//        classificacao = "Juvenil"
//    } else if (idade >=18 && idade <= 49) {
//        classificacao = "Adulto"
//    }

//    if (idade < 8 || idade > 60) {
//        classificacao = "Não pode ser nadador, mínimo 8 anos e máximo 60 anos"
//    } else if (idade in 8..10) {
//        classificacao = "Infantil"
//    } else if (idade in 11..17) {
//        classificacao = "Juvenil"
//    } else if (idade in 18..49) {
//        classificacao = "Adulto"
//    }

    if (idade in 8..60) {
        if (idade <= 10) {
            classificacao = "Infantil"
        } else if (idade <= 17) {
            classificacao = "Juvenil"
        } else if (idade <= 49) {
            classificacao = "Adulto"
        }
    } else {
        classificacao = "Não pode ser nadador, mínimo 8 anos e máximo 60 anos"
    }

    println("\nDados da pessoa\n" +
            "Nome: $nome\n" +
            "Idade: $idade\n" +
            "Classificação: $classificacao")
}