//Exercício: Busca Elementos

fun main(){
    //Array de strings
    val names = arrayOf("Alice", "Bob", "Charlie", "David", "Emma", )
    val searchName = "Chharlie" //Elemento a ser buscado
    var found = false //Variável para verificar se o nome foi encontrado

    //Loop para verificar se o elemento está presente
    for (name in names) {
        if (name == searchName){
            found = true
            break
        }
    }
    if (found){
        println("$searchName foi encontrado no array.")
    }else{
        println("$searchName não foi encontrado no array.")
    }
}