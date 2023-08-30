fun main() {
    println("\nInsire uma data no formato DD-MM-AAAA: ")
    val data = readln()

    if (validacaoFormatoData(data)) {
        val partes = data!!.split("-")
        val dia = partes[0].toInt()
        val mes = partes[1].toInt()
        val ano = partes[2].toInt()

        if (validacaoMes(mes)) {
            val diasNoMes = quantosDiasNoMes(mes, ano)
            if (dia in 1..diasNoMes) {
                println("Data válida")
            } else {
                println("Dia inválido no mês digitado")
            }
        } else {
            println("Mês inválido")
        }
    } else {
        println("Formato de data inválido\n" +
                "Deve ser DD-MM-AAAA *com hífens")
    }
}

fun validacaoFormatoData(data: String?): Boolean {
    return data?.matches(Regex("\\d{2}-\\d{2}-\\d{4}")) ?: false
}

fun validacaoMes(mes: Int): Boolean {
    return mes in 1..12
}

fun quantosDiasNoMes(mes: Int, ano: Int): Int {
    return when (mes) {
        2 -> if (anoBissexto(ano)) 29 else 28
        4, 6, 9, 11 -> 30
        else -> 31
    }
}

fun anoBissexto(ano: Int): Boolean {
    return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
}