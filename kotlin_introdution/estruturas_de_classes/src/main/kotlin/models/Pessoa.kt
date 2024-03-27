package models

import java.time.LocalDate
import java.time.Period


open class Pessoa (
    //Atributos
    var nome: String ="",
    var dataDeNascimento: LocalDate = LocalDate.of(1990,1,1),
    var peso : Int = 0,
    var altura: Double = 0.0
){
    val idade :Int
        get() {
            return Period.between(dataDeNascimento, LocalDate.now()).years
        }


    open fun exibirDados(){
        println("------------------------------------------")
        println("Nome: $nome")
        println("peso: $peso")
        println("Altura: $altura")
        println("Data de nascimento: $dataDeNascimento")
        println("Idade: $idade")
        println("------------------------------------------")
    }

    /*
    fun calcularIdade():Int{
        var idade = Period.between(dataDeNascimento, LocalDate.now()).years
        return idade
    }
    */
}