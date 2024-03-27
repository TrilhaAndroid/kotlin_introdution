fun main(args: Array<String>) {


    //var numeros = listOf(0,1,2,3,4,6,8,4,55,95,94,64,646,66,53,35,64)

    //Com if (Não se aplica)

    /*
    //if(numeros[numeros.size - 1] % 2 == 0){
    if(numeros[2] % 2 == 0){
        //println("O número ${numeros[numeros.size - 1]} é um número par")
        println("O número ${numeros[2]} é um número par")
    }
    */


    //Laço while
    //var i = 0
    /*
    while(i < numeros.size){
        if(numeros[i] % 2 == 0) {
            println("O número ${numeros[i]} é um número par!")
        }else{
            println("O número ${numeros[i]} é um número impar!")
        }
        i++
    }*/

    //Aplicando Ternário
    /*
    while(i < numeros.size){
        if (numeros[i] % 2 == 0) println("O número ${numeros[i]} é um número par!") else println("O número ${numeros[i]} é um número impar!")
        i++
    }
    */

    //Laço for + ternario

    //for (i in 0..numeros.size -1){
    /*
    for (i in 0 until numeros.size){
        if (numeros[i] % 2 == 0) println("O número ${numeros[i]} é um número par!") else println("O número ${numeros[i]} é um número impar!")
    }*/

    //Outro exemplo

    //var frutas = listOf("Maçã", "Uva","Goiaba","Pitaia")

    //while
    /*
    var i = 0
    while(i < frutas.size){
        println("Fruta: ${frutas[i]}")
        i++
    }
    */
    //for
    /*
    for ( i in frutas){
        println("Fruta: $i")
    }
    */

    //Usando: while
    /*
    var life = 10
    while (life > 0) {
        println("O jogador está com $life vidas")
        life--
    }*/

    //Do + While
    /*
    var numeros = listOf(0,1,2,3,4,6,8,4,55,95,94,64,646,66,53,35,64)
    var i = 0
    var numero = 0

    do{
        numero = numeros[i]
        i++
    }while(numero % 2 != 1)
        println("Você obteve o primeiro número impar apos $i valores da lista!")
    */
}