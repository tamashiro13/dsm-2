import java.util.Scanner;

public class SalarioScanner {
    public static void main(String[] args) {
    double sm, sf, qs;

    Scanner leia = new Scanner(System.in);
    System.out.println("Digite seu salário: ");
    sf = leia.nextDouble();
    sm = 1621;
    qs = sf / sm;
    System.out.println("Você ganha: " + qs + " salários mínimos");
    }
}
