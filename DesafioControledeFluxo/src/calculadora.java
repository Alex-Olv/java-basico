import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            
        
        System.out.println("escolha uma opção \n1-multiplicação \n2-divisão \n3-soma \n4-subtração \n5-encerrar");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                multiplicacao(scanner);
                break;
            case 2:
                try{ divisão(scanner);
                }catch(DivisaoException e){
                System.out.println("Erro: " + e.getMessage());
                }
                break;
            case 3:
                soma(scanner);
                break;
            case 4:
               subtracao(scanner);
                break;
            case 5:
                System.out.println("encerrando...");
                break;
            
        
            default:
                System.out.println("voce precisa escolher uma das cinco opçoes");

                break;
        }
    }
    
}

        static void multiplicacao(Scanner scanner){
            System.out.println("escolha o primeiro numero ");
            int num1 = scanner.nextInt();

            System.out.println("escolha o segundo numero ");
            int num2 = scanner.nextInt();

            int resultado = num1 * num2 ;

            System.out.println("O resultado da multiplicação é: " + resultado + "\n");
        }

        static void divisão(Scanner scanner) throws DivisaoException{
            System.out.println("escolha o primeiro numero ");
            int num1 = scanner.nextInt();

            System.out.println("escolha o segundo numero ");
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new DivisaoException("os numeros digitados não podem ser divididos");
            }

            int resultado = num1 / num2 ;

            System.out.println("O resultado da divisão é: " + resultado + "\n");
        }

        static void soma(Scanner scanner){
            System.out.println("escolha o primeiro numero ");
            int num1 = scanner.nextInt();

            System.out.println("escolha o segundo numero ");
            int num2 = scanner.nextInt();

            int resultado = num1 + num2 ;

            System.out.println("O resultado da soma é: " + resultado + "\n");
        }

        static void subtracao(Scanner scanner){
            System.out.println("escolha o primeiro numero ");
            int num1 = scanner.nextInt();

            System.out.println("escolha o segundo numero ");
            int num2 = scanner.nextInt();

            int resultado = num1 - num2 ;

            System.out.println("O resultado da subtração é: " + resultado + "\n");
        }

}
