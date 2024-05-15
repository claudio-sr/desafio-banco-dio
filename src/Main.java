public class Main {
    public static void main(String[] args) {

        var maria = new Cliente();
        ContaCorrente cc = new ContaCorrente(maria);
        ContaPoupanca cp = new ContaPoupanca(maria);

        cc.depositar(1000);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}