package Desafios.desafio5;

public class ContaPoupanca extends ContaBancaria {
    double desconto;

    public ContaPoupanca(double saldoConta, TipoConta tipoConta) {
        super(saldoConta, tipoConta.POUPANCA);
    }

    @Override
    public void depositar(double valor) {
        taxaDeposito(valor);
        double deposito = valor - (valor * 0.01);
        this.saldo += deposito;
    }

    public void taxaDeposito(double valor){
        desconto = valor * 0.01;
    }
}