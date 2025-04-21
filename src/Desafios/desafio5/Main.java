package Desafios.desafio5;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        ContaCorrente cc = new ContaCorrente(0, TipoConta.CORRENTE);
        cc.depositar(1324.45);
        System.out.println("Seu saldo é: " + df.format(cc.consultarSaldo()));
        //cc.sacar(100.00);
        //System.out.println("Seu novo saldo é: " + df.format(cc.consultarSaldo()));

        System.out.println("-------------------------");
        System.out.println( );

        ContaPoupanca cp = new ContaPoupanca(0, TipoConta.POUPANCA);
        cp.depositar(1324.50);

        System.out.println("Seu saldo é: " + df.format(cp.consultarSaldo()));
        System.out.println("Taxa de deposito: " + df.format(cp.desconto));
        //.sacar(1400.00);
        //System.out.println("Seu novo saldo é: " +  df.format(cp.consultarSaldo()));

        System.out.println("-------------------------");
        System.out.println( );

        System.out.println("Teste transferência:");
        cc.transferir(1000, cp);

        System.out.println("Saldo conta corrente: " + df.format(cc.consultarSaldo()));
        System.out.println("Saldo conta poupanca: " + df.format(cp.consultarSaldo()));
        System.out.println( );

        cp.transferir(2000, cc);

        System.out.println("Saldo conta corrente: " + df.format(cc.consultarSaldo()));
        System.out.println("Saldo conta poupanca: " + df.format(cp.consultarSaldo()));
    }
}