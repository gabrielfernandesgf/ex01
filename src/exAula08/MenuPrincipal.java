package exAula08;

import java.util.Scanner;

public class MenuPrincipal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

    while (continuar) {
        System.out.println("Escolha a figura geométrica:");
        System.out.println("1. Circulo");
        System.out.println("2. Quadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Retangulo");
        System.out.println("5. Sair");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                Circulo(scanner);
                break;
        }
    }
    }
}
