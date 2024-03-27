fun main(args: Array<String>) {
    /*
    //filter(itera na lista, passando cada item por uma condição, e retorna os iteis cuja verificação seja true, para uma nova lista)
    var lista = listOf(1,2,3,4,5,6,7,8,9)
    println(lista)
    var lista_pares = lista.filter {it % 2 == 0}
    var lista_impares = lista.filter {it % 2 == 1}

    println(lista_pares)
    println(lista_impares)
    */

    //Outro Exemplo
    /*
    var frutas = listOf("Uva","Maçã","Manga","Mamão","Melancia","Maracuja","Melão","Abacaxi","Romã","Abacate","Pera")
    println(frutas)

    var frutasM = frutas.filter {it.startsWith("M")}
    var frutasNaoM = frutas.filter {!it.startsWith("M")}

    println(frutasM)
    println(frutasNaoM)
    */

    //Map (Itera em uma lista, passando cada item por operação, e retorna uma nova lista, com os valores modificados)
    /*
    var frutas = listOf("Uva","Maçã","Manga","Mamão","Melancia","Maracuja","Melão","Abacaxi","Romã","Abacate","Pera")
    println(frutas)

    var frutasMaiuculas = frutas.map { it.uppercase() }
    var frutasMinusculas = frutas.map { it.lowercase() }

    println(frutasMaiuculas)
    println(frutasMinusculas)
    */

    //Reduce (itera em uma lista, e realiza uma operação para todos os itens reduzindo esta lista a um único elemento)
    /*
    var numeros = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    println(numeros)

    var soma = numeros.reduce { acc, i -> acc + i }

    var somaPares = numeros.filter { it % 2 == 0 }.reduce { acc, i -> acc + i }
    var somaImpares = numeros.filter { it % 2 == 1 }.reduce { acc, i -> acc + i }

    var somaParesMaiores10EX2 = numeros.filter { it % 2 ==0 && it > 10 }.map { it * 2 }.reduce { acc, i -> acc + i }
    var somaImparesMaiores10EX2 = numeros.filter { it % 2 == 1  && it > 10}.map { it * 2 }.reduce { acc, i -> acc + i }

    println(soma)
    println(somaPares)
    println(somaImpares)
    println(somaParesMaiores10EX2)
    println(somaImparesMaiores10EX2)
    */
}