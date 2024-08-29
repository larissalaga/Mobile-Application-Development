import java.util.*
fun main(){
     var scanner = Scanner(System.`in`) //Cria um objeto Scanner para leitura de entrada do usuario
     var sair: Char
     
     do {
        coletarDados()
        println("Tecle [c]  para continuar ou [s] para sair:")
        sair = scanner.next()[0]
     }while (sair != 's')
}
fun coletarDados(){
    var scanner = Scanner{System`in`}//Cria um objeto Scanner para leitura de entrada do usuário
    var peso: Float
    var altura: Float
    println("Qual é o seu peso? ")
    peso = scanner.nextFloat()
    println("Qual é a sual altura? ")
    altura = scanner.nextFloat()    

    var imc = calcularIMC(peso, altura) //Calcula o IMC chamando a função 'calcularIMC'
    println("Seu IMC é = %.2f ".format(imc))

    when{
        imc < 18.5 -> println("Você está desnutrido.")
        imc < 25 -> println("Você está dentro do peso normal.")
        imc < 30 -> println("Você está um pouco acima do peso.")
        imc < 35 -> println("Você está com obesidade - Grau I.")
        imc < 40 -> println("Você está com obesidade - Grau II.")
        imc >= 40 -> println("Você está com obesidade - Grau III.")
    }
    fun calcularIMC(peso, altura){
        var imc = (peso / (altura*altura))
        return (imc)
    }
}