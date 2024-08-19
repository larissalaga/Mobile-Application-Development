
//Declaração da função
fun main(){
    //Vamos uspor que temos o seguinte array de números
    val pares = arrayOf(0,2,4,6)
    val impares = arrayOf(1,3,5,7)
    var sumPar = 0
    var sumImpar = 0

    //Vamos usar um loop para imprimir cada número do array
    for (p in pares) {
        sumPar += p
    }
    for (i in impares){
        sumImpar += i
    }
    println("A soma dos pares é : $sumPar")
    println("A soma do impares é : $sumImpar")
}