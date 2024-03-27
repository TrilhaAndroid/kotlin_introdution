import models.Funcionario
import models.Pessoa
import java.time.LocalDate

fun main(args: Array<String>) {

    val pessoa = Pessoa(
        nome = "Ana",
        altura = 1.7,
        peso = 72,
        dataDeNascimento = LocalDate.of(1998,5,25)
    )
    //println(pessoa)
    //println(pessoa.nome)


    val pessoa2 = Pessoa(
        nome = "Carlos",
        altura = 1.85,
        peso = 98,
        dataDeNascimento = LocalDate.of(1982,3,11)
    )
    //println(pessoa2)
    //println(pessoa2.nome)
    //println(pessoa2.altura)
    //println(pessoa2.peso)

    //pessoa.exibirDados()
    pessoa2.exibirDados()

    val funcionario = Funcionario()
    funcionario.nome =  "Pedro"
    funcionario.altura =  1.8
    funcionario.peso =  87
    funcionario.dataDeNascimento = LocalDate.of(2000,9,30)
    funcionario.salario = 15600.45
    funcionario.cargo = "Desenvolvedor Android"

    funcionario.exibirDados()






}