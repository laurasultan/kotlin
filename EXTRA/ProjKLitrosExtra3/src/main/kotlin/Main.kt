fun main(args: Array<String>) {
    print("\nInforme o preço por litro (combustível): ")
    val preco : Float = readln().toFloat()

    print("Informe a quantidade de kilômetros por litro (carro): ")
    val km : Float = readln().toFloat()

    print("Informe a distância a percorrer: ")
    val distancia : Float = readln().toFloat()

    val litros : Float = preco / km

    val gastos : Float = distancia / preco

    println("\nSerão necessários $litros litros e $gastos reais para percorrer esta distância.")
}