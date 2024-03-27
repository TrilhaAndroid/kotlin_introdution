fun main(args: Array<String>) {

    var a= 100
    var b = 20
    //var c = a + b
    //println("A soma é $c")

    //var d = 50
    //var e = 70
    //var f = d + e
    //println("A soma é $f")
    somar(a,b)

    println("O valor da subtração é: ${subtrair(a,b)}!")
    println("O valor da divisão é: ${dividir(a,b)}!")


}

fun somar(valor1: Int,valor2: Int){
    println("A soma é ${valor1 + valor2}!")
}

fun subtrair(valor1:Int,valor2:Int): Int {
    return valor1-valor2
}

fun dividir(valor1: Int,valor2: Int) = valor1/valor2

