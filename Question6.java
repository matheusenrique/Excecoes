import java.util.Scanner;

public class Question6 {
    private String numeroConta;
    private double saldo;

    public Question6(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Novo saldo: " + saldo);
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado. Novo saldo: " + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        Question6 conta = new Question6(numeroConta, saldoInicial);

        for (int i = 0; i < 10; i++) {
            try {
                System.out.print("Digite o valor do saque " + (i + 1) + ": ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro ao realizar saque: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
