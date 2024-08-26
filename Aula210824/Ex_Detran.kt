//Exercicio Detran
//Criar um programa que verifica se o usuário possui ou não carteira de habilitação
fun main(){
    val idade = 25
    val possuiCNH = true // ele possui CNH

    //Verificar se a pessoa é maior de idade e se possui cnh
    if((idade >= 18) && possuiCNH){ //E como and
        println("Você pode dirigir legalmente")
    }else{
        println("Você não pode dirigir legalmente")
    }
    
    val temIngressso = false
    val estaComCamisaDoTime = true
    //Verifica se a pessoa tem ingreso ou esta com a camisa do time
    if (temIngressso || estaComCamisaDoTime){ //Ou como or
        println("Você pode entrar no estádio")
    }else{
        println("Você não pode entrar no estádio")
    }
}