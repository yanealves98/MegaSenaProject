import java.util.Random;
import java.util.Scanner;

public class Interativo {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");

        String name = scanner.nextLine();

        System.out.println("Oi, " + name);

        System.out.println("Qual a sua cor favorita?");

        String cor = scanner.nextLine();

        System.out.println( cor + "  é  uma bela cor ");

        System.out.println("Em qual ano você nasceu?");
        int ano = scanner.nextInt();

        int idade = 2025 - ano;


        System.out.println("Você tem " + idade + " anos");




    }
}