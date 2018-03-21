package pattern1.strategy.exercicio2.perfisInvestidor;

public class Conservador implements Perfil {
    @Override
    public double retorno(Double valorInvestido) {
        return valorInvestido * 0.8 / 100;
    }
}
