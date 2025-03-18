import java.util.Scanner;
import java.util.Random;
public class teste {

    Scanner scanner = new Scanner(System.in);
    Random gerador = new Random();

    public void conversa() {
        System.out.println("Ola seu nome é? ");
        String nome = scanner.nextLine();
        System.out.println("Prazer em conhece-ló " + nome);
        System.out.println(gerador.nextInt(1, 100));
        scanner.close();
    }
}
