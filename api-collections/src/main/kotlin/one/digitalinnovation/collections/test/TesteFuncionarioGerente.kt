package one.digitalinnovation.collections.test
import one.digitalinnovation.collections.Gerente


fun main () {

    val maria = Gerente("Maria Fernandes", "123.123.123-11",5000.0, "senha125")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}

