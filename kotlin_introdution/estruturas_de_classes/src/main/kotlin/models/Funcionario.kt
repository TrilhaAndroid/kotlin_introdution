package models

class Funcionario : Pessoa(){
    var salario : Double = 0.0
    var cargo: String = ""

    override fun exibirDados(){
        println("------------------------------------------")
        println("Nome: $nome")
        println("peso: $peso")
        println("Altura: $altura")
        println("Data de nascimento: $dataDeNascimento")
        println("Idade: $idade")
        println("Cargo: $cargo")
        println("Salario: $salario")
        println("------------------------------------------")
    }
}