package pattern1.strategy.exercicio2.perfisInvestidor;

import pattern1.strategy.exercicio2.Conta;

public class TesteInvestimento {

    public static void main(String[] args) {
        Conta conta = new Conta("Gabriel");
        conta.deposita(1000.0);

        conta.investe(new Conservador());

        new Conta("Gabriel", 1000.0).investe(new Moderado());
        new Conta("Gabriel", 1000.0).investe(new Arrojado());
    }
}
