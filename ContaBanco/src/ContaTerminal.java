import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {    

     Scanner scanner = new Scanner(System.in);

     System.out.println("Por favor, digite o seu nome:");
     String nomeCliente = scanner.nextLine();

     System.out.println("Por favor, digite o número da agencia:");
     String agencia = scanner.nextLine();

     System.out.println("Por favor, digite o número da conta:");
     int numero = scanner.nextInt();

     System.out.println("Por favor, digite o saldo");
     double saldo = scanner.nextDouble();

     System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

     scanner.close();
    }
}
