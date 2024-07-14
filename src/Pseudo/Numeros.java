package Pseudo;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = scan.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = scan.nextInt();
        int soma = num1 + num2;
        int sub  = num1 - num2;
        int mult = num1 * num2;
        int div =  num1 / num2;
        System.out.println("Soma: "+ soma );
        System.out.println("Subtração: "+ sub );
        System.out.println("Multiplicação: "+ mult );
        System.out.println("Divisão: "+ div );

        scan.close();
    }
}
