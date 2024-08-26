//Exercício que verifica se o número é primo ou não
fun main(){
    println("Digite o número a ser verificado:")
    val numString = readLine()//Lendo o número que será verificado se é primo ou não.
    var isPrime = true //Variável como true assumindo inicialmente que é primo

    val num = numString?.toIntOrNull()
    if (num == null){
        println("Entrada Inválida")
        return //Sai da função mai se a entrada for nula
    }

    if (num < 2)) {//verifica se é menor que 2
        isPrime = false
    }else {
        for (i in 2 until num){
            if ((num % i == 0) or (num < 2)) {//verifica se é um número divisível por i 
                isPrime = false
                break //interromper o loop
            }
        }
    }
    //Após o loop, verificamos o valor de isPrime para determinar se é um primo ou não
    if (isPrime){
        println("$num é um número primo")

    }else{
        println("$num não é um número primo")
    }
}