import java.util.Scanner;

public class IdadeScanner {
    public static void main(String[] args) {
        int idade, dias;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        idade = leia.nextInt();
        dias = 365 * idade;
        System.out.println("Você já viveu: " + dias + " dias");
    }
}
