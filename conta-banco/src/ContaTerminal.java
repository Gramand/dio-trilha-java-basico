import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da sua conta bancária: ");
        numero = scanner.nextInt();

        System.out.println("Informe a agência da sua conta bancária: ");
        agencia = scanner.next();

        System.out.println("Informe o seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Informe o valor que deseja depositar: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + "!" + " Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo de R$ " + saldo + " já está disponível para saque.");

        scanner.close();
        System.exit(0);
    }
}
