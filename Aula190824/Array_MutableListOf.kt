fun main(){
    //Criando uma lista mutavel de números inteiros vazia
    val numero = mutableListOf<Int>()

    //Adicionando elementos à lista
    numero.add(1)
    numero.add(2)
    numero.add(3)

    //Exibindo a lista de números
    println("Lista de números : $numero")

    //Removendo um elemento da lista
    numero.removeAt(1)

    //Exibindo a lista apos a remonção
    println("Lista de numeros após a remoção: $numero")

}