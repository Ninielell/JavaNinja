package Desafios.desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo, saque;
    TipoConta tipoConta;

    // Construtor

    public ContaBancaria () {
    }

    public ContaBancaria(double saldoConta, TipoConta tipoConta) {
        this.saldo = saldoConta;
        this.tipoConta = tipoConta;
    }

    // Metodos

    public abstract void depositar(double valor);

    public void transferir(double valor, ContaBancaria destino){
        if(this.saldo >= valor){
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso! para: " + destino);
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }

    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saque = this.saldo -= valor;
        } else {
            System.out.println("Você não possui dinheiro suficiente para saque!");
        }
    }

    public String toString() {
        return "Conta " + tipoConta;
    }
}