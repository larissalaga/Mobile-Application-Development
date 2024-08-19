fun main(){
    //Declaração de variável
    var idade = 42 //idade do professor
    var altura = 1.67 //Altura do professor  (usando o 'f' para indicar o que é um float)
    var inicial = 'V' // Inicial do nome do professor

    //  Impressão das informações do indivíduo usando interpolação de strings
    println("Minha inicial é $inicial, tenho $idade e minha altura é %.2f".format(altura))

}