fun main(){
    println("Digite o nome:")
    val nome = readLine()!!

    println("Digite a idade:")
    val idade = readLine()!!.toDouble()
    
    println("Digite o e-mail:")
    val email = readLine()!!

    println("O usuário está ativo? (true/false)")
    val usuarioAtivo = readLine()!!toBoolean()
    
    println("Nome: $nome.")
    println("Idade: $idade.")
    println("E-mail: $email.")
    println("O usuário está $usuarioAtivo")
    

}