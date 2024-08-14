fun main(){
    println("Digite a temperatura em Celsius:")
    val celsius = readLine()!!.toDouble()

    val fahrenheit = (celsius * 9/5 +32)
    val kelvin = (celsius +273.15)

    println("A temperatura em Fahrenheit é $fahrenheit e em Kelvin é $kelvin")

}