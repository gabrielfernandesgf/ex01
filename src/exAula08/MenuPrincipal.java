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
                System.out.println("Digite a cor do quadrado: ");
                String quadradoCor = scanner.next();
                System.out.println("Digite o lado 1 do quadrado: ");
                double lado1 = scanner.nextDouble();
                System.out.println("Digite o lado 2 do quadrado: ");
                double lado2 = scanner.nextDouble();

                Quadrado quadrado = new Quadrado();
                quadrado.setCor(quadradoCor);
                quadrado.setLado1(lado1);
                quadrado.setLado2(lado2);
                
                String result = quadrado.toString();
                System.out.println(result);
                break;
            
            case 2:
                System.out.println("Digite a cor do circulo: ");
                String circuloCor = scanner.next();
                System.out.println("Digite o raio: ");
                double raio = scanner.nextDouble();

                Circulo circulo = new Circulo();
                circulo.setCor(circuloCor);
                circulo.setRaio(raio);

                String resultCirculo= circulo.toString();
                System.out.println(resultCirculo);
                break;

            case 3:
                System.out.println("Digite a cor do Triangulo: ");
                String trianguloCor = scanner.next();
                System.out.println("Digite a base: ");
                double base = scanner.nextDouble();
                System.out.println("Digite a altura: ");
                double alturaTriangulo = scanner.nextDouble();

                Triangulo triangulo = new Triangulo();
                triangulo.setAltura(alturaTriangulo);
                triangulo.setBase(base);
                triangulo.setCor(trianguloCor);

                String resultTriangulo = triangulo.toString();
                System.out.println(resultTriangulo);
                break;

            case 4:
                System.out.println("Digite a cor do Retangulo: ");
                String retanguloCor = scanner.next();
                System.out.println("Digite o lado 1: ");
                double retanguloLado1 = scanner.nextDouble();
                System.out.println("Digite o lado 2:");
                double retanguloLado2 = scanner.nextDouble();

                Retangulo retangulo = new Retangulo();
                retangulo.setCor(retanguloCor);
                retangulo.setLado1(retanguloLado1);
                retangulo.setLado2(retanguloLado2);

                String resultRetangulo = retangulo.toString();
                System.out.println(resultRetangulo);
                break;

            case 5:
                continuar = false; // Define a variável continuar como false para sair do loop
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha uma opção válida.");
        }
    }
    }
}
