fun main(args: Array<String>) {
    print("Informe seu nome: ")
    val nome : String = readln()

    print("Informe seu valor hora: ")
    val valorHora : Double = readln().toDouble()

    print("Informe sua carga horária: ")
    val cargaHoraria : Int = readln().toInt()

    val salarioBase : Double = valorHora * cargaHoraria

    println("\nNome do funcionário: $nome")
    println("Valor hora: $valorHora")
    println("Carga horária mensal: $cargaHoraria")
    println("Salário base: $salarioBase")
}