import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("\n--------------------------");
        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\n--------------------------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar limite do cheque especial");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Consultar valor usado do cheque especial");
            System.out.println("7 - Sair");

    opcao = scanner.nextInt();

    switch (opcao) {
        case 1:
            System.out.printf("Saldo: R$ %.2f\n", conta.consultarSaldo());
            break;

        case 2:
            System.out.printf("Limite do cheque especial: R$ %.2f\n", conta.consultarLimiteChequeEspecial());
            break;

        case 3:
            System.out.println("Digite o valor do saque:");
            double valorSaque = scanner.nextDouble();

            if (conta.sacarValor(valorSaque)) {
              System.out.println("Saque realizado com sucesso!");
            } else {
              System.out.println("Saldo insuficiente!");
            }
            break;

        case 4:
            System.out.println("Digite o valor do depósito:");
            double valorDeposito = scanner.nextDouble();

            if (conta.depositarValor(valorDeposito)) {
              System.out.println("Depósito realizado com sucesso!");
            } else {
              System.out.println("Valor inválido para depósito!");
            }
            break;


        case 5:
            System.out.println("Digite o valor do boleto:");
            double valorBoleto = scanner.nextDouble();

            if (conta.pagarBoleto(valorBoleto)) {
              System.out.println("Boleto pago com sucesso!");
            } else {
              System.out.println("Não foi possível pagar o boleto.");
            }
            break;

        case 6:
            System.out.println("Valor usado do cheque especial: " + conta.consultarValorUsadoLimite());
            break;

        case 7:
            System.out.println("Saindo do sistema bancário...");
            break;

        default:
            System.out.println("Opção inválida! Tente novamente.");
    }
}

        scanner.close();
    }
}
