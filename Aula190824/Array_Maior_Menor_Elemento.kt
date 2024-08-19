//Exercício mairo e menor elementos
fun main(){
    //Array de inteiros
    val numbers = intArrayOf(8, 3, 12, 6, 20, 50 )
    var min = numbers[0] //Variável para armazenaro o menor elemento
    var max = numbers[0] // Variável para armazenar o maior elemento
    
    //Loop para encontrar o menor e o maior elemento
    for (number in numbers){
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }

        
    }
    println("O menor elemento é $min")
    println("O maior elemento é $max")

}