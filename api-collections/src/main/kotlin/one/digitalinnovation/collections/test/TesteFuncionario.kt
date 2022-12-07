package one.digitalinnovation.collections.test

import one.digitalinnovation.collections.Funcionario
import one.digitalinnovation.collections.Pessoa
import java.math.BigDecimal

fun main () {
    val jether = Pessoa("Jether Rodrigues", "123.123.123-11")
    println(jether.nome)
    println(jether.cpf)

    val joao = Funcionario("Joao Rodrigues", "123.123.123-11", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}
