import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float bi1, bi2, bi3, bi4;
        System.out.print("Digite o nome do aluno: ");
        String aluno = scan.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = scan.nextInt();
        System.out.println("Digite a nota do primeiro bimestre: ");
        bi1 = scan.nextFloat();
        System.out.println("Digite a nota do segundo bimestre: ");
        bi2 = scan.nextFloat();
        System.out.println("Digite a nota do terceiro bimestre: ");
        bi3 = scan.nextFloat();
        System.out.println("Digite a nota do quarto bimestre: ");
        bi4 = scan.nextFloat();
        float media =  (bi1 + bi2 + bi3 + bi4)/4;
        System.out.println("--##----------##--");
        System.out.println("Nome do aluno: " + aluno + "\nIdade do aluno: " + idade +"\nMedia de notas do aluno: " + media);
        scan.close();
    }
}
