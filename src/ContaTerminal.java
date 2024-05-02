import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in, "UTF-8").useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        String mensagem = "Olá, " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia +
                ", conta " + numero +
                " e seu saldo de R$ " + String.format("%.2f", saldo) +
                " já está disponível!";

        System.out.println(mensagem);

    }

}
