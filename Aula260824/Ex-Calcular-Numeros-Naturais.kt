fun main(){
    val numeros = 10
    var soma = 0
    //Utilizando o loop for para calcular a soma dos  primeiros n numeros naturais
    for (i in 1..numeros){
        soma +=i
    }
    println("A soma dos primeiros $numeros números naturais é: $soma")
}