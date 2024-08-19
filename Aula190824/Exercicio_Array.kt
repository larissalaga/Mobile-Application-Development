fun main(){
    //Trabalhando com Array (Vetores, Matrizes, Coleções, Listas)
    //Tipos de dados que permitem armazenar multiplos valores em uma mesma variável
    //Obs.: O acesso dos elementos do Array é feito através de  um indice que começa em zero
    //Declaração de um Array
    //var nomeDaVariavel = arrayOff(valor,valor,valor)
    
    val idades = arrayOf(8,36,42)
    //Acesso a uma jposição específica do array
    println("O registro Zero de idade é ${idades[1]}")
    
    val alturas = FloatArray(256)

    //Outra forma de declaração e atribuição de valores a um array
    alturas[0] =1.71f
    alturas[1] =1.62f
    alturas[2] =1.53f
    alturas[3] =1.84f
    alturas[4] =1.92f

    //Imprimindo o valor do primeiro registro de altura
    println("O registro  ZERO de alturas é : %.2f".format(alturas[0]))
    println("O registro  UM de alturas é : %.2f".format(alturas[1]))
    println("O registro  DOIS de alturas é : %.2f".format(alturas[2]))

    //Outra forma de declaração de atribuição de valor de um Array
    val nome = charArrayOf('A','B','C','D','E','F','G')
    println("O último caracter de nome é: ${nome[6]}")

    //
    val empresa = "FIAP"
    println("Nome da empresa é ${empresa[0]}")

    //Tamanho
    var tamanho: Int
    tamanho = nome.size
    println("Tamanho = ${tamanho}")
    println("A posição do ultimo caractere de nome é: ${nome[tamanho-1]}")

    //nós temos 3 posições de memoria sendo utilizadas
    println("Quantidade de itens: ${idades.size}")

    //Qual é o peso do array
    println("Peso do array: ${idades.size * 4} bytes") // Um int possui 4 bytes de tamanho
}