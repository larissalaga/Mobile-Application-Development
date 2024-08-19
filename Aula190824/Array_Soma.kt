
//Exercício: Soma dois Elementos
fun main(){
    //Array de inteiros
    val number = intArrayOf(5,10,15,20,25)
    var sum = 0 // Variável para armazenar a soma // mutável
    
    //Loop para somar os elementos do arrya
    for (number in number) {
        sum += number
    }
    //Imprima o resultado
    println("Soma dos elementos do array : $sum")
}