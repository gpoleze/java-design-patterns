package pattern1.strategy.exercicio2.perfisInvestidor;

public class Arrojado implements Perfil {
    private final double escolhido = new java.util.Random().nextDouble();

    @Override
    public double retorno(Double valorInvestido) {
        if (escolhido > 0.8)
            return valorInvestido * 5 / 100;
        if (escolhido > 0.5)

            return valorInvestido * 3 / 100;

        return valorInvestido * 0.6 / 100;
    }
}