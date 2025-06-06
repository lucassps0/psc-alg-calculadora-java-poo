import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("Digite o primeiro número: ");
            double numeroUm = input.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numeroDois = input.nextDouble();

            Calculadora calc = new Calculadora(numeroUm, numeroDois);

            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz quadrada do primeiro número");
            System.out.print("Digite a opção (1-6): ");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Resultado: " + calc.somar());
                    break;
                case 2:
                    System.out.println("Resultado: " + calc.subtrair());
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.multiplicar());
                    break;
                case 4:
                    System.out.println("Resultado: " + calc.dividir());
                    break;
                case 5:
                    System.out.println("Resultado: " + calc.potencia());
                    break;
                case 6:
                    System.out.println("Resultado: " + calc.raizQuadrada());
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.print("\nDigite 'Q' para sair ou qualquer outra tecla para continuar: ");
            opcao = input.next();

        } while (!opcao.equalsIgnoreCase("Q"));

        System.out.println("Programa encerrado.");
        input.close();
    }
}
