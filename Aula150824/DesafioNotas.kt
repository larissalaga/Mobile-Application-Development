fun main(){
    prinln("Digite a nota da primeira avaliação:")
    val nota1 = readLine()!!.toDouble()
    
    prinln("Digite a nota da segunda avaliação:")
    val nota2 = readLine()!!.toDouble()
    
    prinln("Digite a nota da terceira avaliação:")
    val nota3 = readLine()!!.toDouble()
    
    val media =(nota1+nota2+nota3)/3
    
    val mediaFormatada = String.format("%.2f", media)
   
    println("A média é $media ou mediaformatada $mediaFormatada")
}
