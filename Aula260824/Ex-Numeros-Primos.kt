fun main(){
    val num = 4 //Definindo o número que será verificado se é primo ou não.
    var isPrime = true //Variável como true assumindo inicialmente que é primo

    for (i in 2 until num){
        if (num % i == 0){//verifica se é um número divisível por i
            isPrime = false
            break //interromper o loop
        }
    }
    //Após o loop, verificamos o valor de isPrime para determinar se é um primo ou não
    if (isPrime){
        println("$num é um número primo")

    }else{
        println("$num não é um número primo")
    }
}