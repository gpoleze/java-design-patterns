package pattern1.strategy.exercicio1;


import pattern1.strategy.exercicio1.impostos.Imposto;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

        double valorDoImposto = imposto.calcula(orcamento);
        System.out.println(valorDoImposto);

    }
}
