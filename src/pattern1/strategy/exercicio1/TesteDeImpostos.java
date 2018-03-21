package pattern1.strategy.exercicio1;

import pattern1.strategy.exercicio1.impostos.ICCC;
import pattern1.strategy.exercicio1.impostos.ICMS;
import pattern1.strategy.exercicio1.impostos.ISS;

public class TesteDeImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(3000.1);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();

        // Calculando o ISS
        calculador.realizaCalculo(orcamento, new ISS());

        // Calculando o ICMS
        calculador.realizaCalculo(orcamento, new ICMS());

        // Calculando o ICCC
        calculador.realizaCalculo(orcamento, new ICCC());
    }
}
