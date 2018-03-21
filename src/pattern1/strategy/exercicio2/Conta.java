package pattern1.strategy.exercicio2;


import pattern1.strategy.exercicio2.perfisInvestidor.Perfil;

public class Conta {

    private static double IMPOST0_SOBRE_LUCRO = 0.25;
    private final String titular;
    private double saldo = 0;

    public Conta(String titular) {
        this.titular = titular;
    }

    public Conta(String titular, double valorInicial) {
        this.titular = titular;
        this.saldo = valorInicial;
    }

    public void deposita(double valor) {
        saldo += valor;
//        System.out.println("O titular " + titular + " possui R$ " + saldo + " em sua conta");
    }

    public void investe(Perfil perfil) {
        double lucro = perfil.retorno(saldo);
        System.out.println("O investimento retornou um lucro bruto de R$" + lucro);

        saldo += lucro * (1 - IMPOST0_SOBRE_LUCRO);
        System.out.println("O titular " + titular + " possui R$ " + saldo + " em sua conta");
    }

}
