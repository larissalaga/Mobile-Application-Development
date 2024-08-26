//Desafio: Calcular a soma dos números pares em uma lista de números.
//Criar uma lista de números e calcular a soma dos números pares
fun main(){
    val lista = arrayOf(0,1,2,3,4,5,6 )
    var soma = 0

    for (i in lista){
        if(i % 2 == 0){
            soma += i
            println(i)
        }
    }
    println("A soma dos números pares de 0 até é: $soma")

}

