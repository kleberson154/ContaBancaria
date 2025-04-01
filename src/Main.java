import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero da Conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Digite o numero da Agencia: ");
        String numeroAgencia = sc.next();
        System.out.print("Digite o nome do Cliente: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        System.out.print("Digite o valor do saldo: ");
        double valorSaldo = sc.nextDouble();

        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %d e seu saldo $%.2f ja esta disponivel ", nomeCliente, numeroAgencia, numeroConta, valorSaldo);

        sc.close();
    }
}