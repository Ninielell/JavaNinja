package Desafios.desafio5;

public class ContaCorrente extends ContaBancaria {
    // Construtor
    public ContaCorrente(double saldoConta, TipoConta tipoConta) {
        super(saldoConta, tipoConta.CORRENTE);
    }

    // Metodo depositar
    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

}