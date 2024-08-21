//Cria um programa que verifica se o usuário tem o acesso ao sistema ou não

// fun main(){
//     val usuario = "Lary"
//     val senha = "12345"

//     if ((usuario == "Lary") and (senha == "12345")){ //&&
//         println("Acesso permitito.")
//     }else{
//         println("Acesso negado.")
//     }
// }

//versão 2.0
fun main(){
    println("Digite o usuário:")
    val usuarioInput = readLine()
    println("Digite a senha:")
    val senhaInput = readLine()

    val usuario = "Lary"
    val senha = "12345"



    if ((usuarioInput == usuario) and (senhaInput == senha)){
        println("Acesso permitito.")
    }else{
        println("Acesso negado.")
    }
}