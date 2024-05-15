public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        System.out.printf("Agencia: %s%n", super.cliente.getNome());
        System.out.printf("Agencia: %d%n", super.agencia);
        System.out.printf("Numero: %d%n", super.numeroConta);
        System.out.printf("Saldo: %.2f%n", super.saldo);
    }
}
