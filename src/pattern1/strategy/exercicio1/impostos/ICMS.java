package pattern1.strategy.exercicio1.impostos;

import pattern1.strategy.exercicio1.Orcamento;

public class ICMS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
