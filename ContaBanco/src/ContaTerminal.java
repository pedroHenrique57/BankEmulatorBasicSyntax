import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {

    String numeroAgencia, nomeCliente;

    int numeroConta;

    double saldoConta;

    Scanner sc = new Scanner(System.in);

    System.out.println(" Olá! Seja bem vindo ao sistema do Banco.\nInsira por favor o número da sua agência:");
    numeroAgencia = sc.nextLine();

    System.out.println("Insira por favor o número da sua conta:");
    numeroConta = sc.nextInt();

    sc.nextLine();

    System.out.println("Insira por favor o nome da sua conta:");
    nomeCliente = sc.nextLine();

    System.out.println("Insira por favor o saldo da sua conta:");
    saldoConta = sc.nextDouble();

    System.out.printf(
        "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
        nomeCliente, numeroAgencia, numeroConta, saldoConta);
  }
}
