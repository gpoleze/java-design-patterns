package pattern1.strategy.exercicio2.perfisInvestidor;

public class Moderado implements Perfil {
    private final double escolhido = new java.util.Random().nextDouble();

    @Override
    public double retorno(Double valorInvestido) {
        if (escolhido > 0.5)
            return valorInvestido * 2.5 / 100;

        return valorInvestido * 0.7 / 100;
    }
}
