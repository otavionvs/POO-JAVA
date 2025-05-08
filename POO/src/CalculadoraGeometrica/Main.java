package CalculadoraGeometrica;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Sistema de Calculadora de Formas Geometricas");
        System.out.println("Qual forma você deseja usar?");
        System.out.println(
                "Opções: \n" +
                "1. Quadrado\n" +
                "2. Retângulo");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("Digite a cor do quadrado: ");
                String cor = sc.next();
                System.out.println("Digite o lado do quadrado: ");
                double lado = sc.nextDouble();

                Quadrado quadrado = new Quadrado(cor, lado);

                System.out.println("Perimetro: " + quadrado.calculaPerimetro());
                System.out.println("Area: " + quadrado.calculaArea());
                System.out.println("Volume: " + quadrado.calculaVolume());

                break;
            }
        }

    }
}
