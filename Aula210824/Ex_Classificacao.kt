//Exercício Classificação numérica
fun main(){
    val numero = -1 // Definindo o valor do número a ser verificado

    if (numero >0){ //Verifica se o numero é maior que zero
        println ("O número é positivo") // Se verdadeiro vai imprimir isso aqui
    } else if(numero < 0){ // Caso o contrário verifica se o número é menor que zero
        println("O número é negativo") // Se verdadeiro imprime essa mensagem
    } else{
        println("O número é zero") // Se nenhuma das condições anteriores forem verdadeiras
    }
}