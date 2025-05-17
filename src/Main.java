import Contas.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Eduardo", 250302);
        cb.extrato();
    }
}