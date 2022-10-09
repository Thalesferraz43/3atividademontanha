import java.util.Scanner;
public class Atividade{
public static void main(String[] args) {

    int num1, num2, soma;
    Scanner sc = new Scanner(System.in); 
    System.out.print("Digite o primeiro número: ");
    num1 = sc.nextInt();
    System.out.print("Digite o segundo número: ");
    num2 = sc.nextInt();
    soma = num1+num2;
    System.out.println("A soma do primeiro número com o segundo é: "+soma);
 }
}
