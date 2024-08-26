//Exercício - Maior ou menor idade
fun main(){
    println("Digite a sua idade:")
    val idadeString = readLine()// lê a entrada como uma String

    //Tenta converter a entrada de idade para um valor numérico
<<<<<<< HEAD
    val idade = idadeString?.toIntOrNull()
=======
    val idade = idadeString.toIntOrNull
>>>>>>> c08707b18ea481ff6f51cbf378bd1b23c0a49c2c
    if (idade == null){
        println("Entrada Inválida")
        return //Sai da função mai se a entrada for nula
    }
    if (idade>=18){
        println("Você é maior de idade")        
    }else{
        println("Você é menor de idade")
    }
}
