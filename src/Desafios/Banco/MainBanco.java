package Desafios.Banco;

public class MainBanco {
    public static void main(String[] args) {
        Cliente davi = new Cliente();
        davi.setNome("Davi");
        Conta cc = new ContaCorrente(davi);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(davi);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
