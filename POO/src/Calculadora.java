import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double num1, num2;
        int tipoCalculo;

        System.out.println("Bem vindo ao programa Calculadora!");
        System.out.println("Escreva o primeiro valor: ");
        num1 = sc.nextDouble();
        System.out.println("Escreva o segundo valor: ");
        num2 = sc.nextDouble();
        System.out.println("Opcões de calculo: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("Escolha: ");
        tipoCalculo = sc.nextInt();

        if (tipoCalculo == 1) {
            System.out.println("O Resultado é: " + (num1 + num2));
        } else if (tipoCalculo == 2) {
            System.out.println("O Resultado é: " + (num1 - num2));
        } else if (tipoCalculo == 3) {
            System.out.println("O Resultado é: " + (num1 * num2));
        } else if (tipoCalculo == 4) {
            System.out.println("O Resultado é: " + (num1 / num2));
        }
    }
}
