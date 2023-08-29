import java.util.Date

fun main(args: Array<String>) {
    print("\nInforme seu ano de nascimento: ")
    val anoNascimento : Int = readln().toInt()

    print("Informe o ano atual: ")
    val anoAtual : Int = readln().toInt()

    val idadeAtual : Int = anoAtual - anoNascimento
    val idade2020 : Int = 2020 - anoNascimento

    println("\nIdade atual: $idadeAtual anos\n" +
            "Idade em 2020: $idade2020 anos")
}