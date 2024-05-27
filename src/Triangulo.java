import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base, altura, area;

        System.out.print("Digite a base do triângulo: ");
        base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        altura = scanner.nextDouble();

        area = (base * altura) / 2;

        System.out.println("Base do triângulo: " + base);
        System.out.println("Altura do triângulo: " + altura);
        System.out.println("Área do triângulo: " + area);

        scanner.close();
    }
}
