package bancoDigital;

public class Main {

    public static void main(String[] args) {

        Cliente louise = new Cliente ();
        louise.setNome("Louise");

        Conta cc = new ContaCorrente(louise);
        Conta poupanca = new ContaPoupanca(louise);

        cc.depositar(300);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
