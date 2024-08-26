//Exercício - Avaliação de notas

fun main(){
    //Definindo a nota do aluno claudio
    val nota = 85

    //Usando o when para avaliar o conceito de nota
    val conceito = when (nota){
        in 0..49 -> "F"
        in 50..59 -> "D"
        in 60..69 -> "C"
        in 70..79 -> "B"
        in 80..89 -> "A"
        else -> "Nota Invalida"
    }
    //Exibindo o conceito de nota
    println("Conceito : $conceito")
}