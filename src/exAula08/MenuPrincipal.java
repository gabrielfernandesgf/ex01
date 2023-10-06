package exAula08;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

    while (continuar) {
        System.out.println("Escolha a figura geométrica:");
        System.out.println("1. Quadrado");
        System.out.println("2. Circulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Retangulo");
        System.out.println("5. Sair");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite a cor do quadrado:");
                String cor = scanner.next();
                System.out.println("Digite o lado Do quadrado:");
                double lado1 = scanner.nextDouble();

                Quadrado quadrado = new Quadrado();
                quadrado.setCor(cor);
                quadrado.setLado1(lado1);
                
                String result = quadrado.toString();
                System.out.println(result);
                break;
            
            case 2:
                System.out.println("aa");
                break;

            case 3:

            case 4:

            case 5:
            
            default:
                System.out.println("oo");
        }
    }
    }
}
