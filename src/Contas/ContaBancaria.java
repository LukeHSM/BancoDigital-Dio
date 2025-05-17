package Contas;

import Utilitarios.Cliente;

public class ContaBancaria implements Interfaces.ContaBancaria {
    protected int saldoInt;
    protected Cliente clt;

    public ContaBancaria(String nome, int saldoInt) {
        this.clt = new Cliente(nome);
        setSaldoInt(saldoInt);
    }

    public int getSaldoInt() {
        return this.saldoInt;
    }

    public void setSaldoInt(int saldoInt) {
        this.saldoInt = saldoInt;
    }

    @Override
    public void sacar(int qntd){
        this.saldoInt -= qntd;
    }
    @Override
    public void depositar(int qntd){
        this.saldoInt += qntd;
    }

    @Override
    public void transferir(int qntd){
        this.saldoInt -= qntd;
    }

    @Override
    public void extrato(){
        System.out.format("%s, seu saldo atual é R$%.2f.%n", this.clt.getNome (), (double)getSaldoInt() / 100);
    }
}
