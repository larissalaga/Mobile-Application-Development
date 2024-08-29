fun main(){
    val prCox = 5.0
    val prCerv = 15.0
    val coxinha = 3
    val cerveja = 2
    var somaCox = (prCox * coxinha)
    var somaCerv = (prCerv * cerveja)
    var soma = (somaCox + somaCerv)
    var taxa = (0.1 * soma)
    var total = (soma + taxa)
    println(".: Lanchonete Lary :.")
    println("-----------------------")
    println("$coxinha Coxinhas      R$ %.2f".format(somaCox))
    println("$cerveja Cervejas      R$ %.2f".format(somaCerv))
    println("Somatorio       R$ %.2f".format(soma))
    println("Taxa 10%%        R$  %.2f".format(taxa))
    println("-----------------------")
    println("Conta final     R$ %.2f".format(total))
}