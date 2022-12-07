package one.digitalinnovation.collections.test

import one.digitalinnovation.collections.Analista
import one.digitalinnovation.collections.Funcionario
import one.digitalinnovation.collections.Pessoa
import java.math.BigDecimal

fun main () {

    val joao = Analista("Joao Rodrigues", "123.123.123-11",2000.0)
    imprimeRelatorio(joao)

}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())