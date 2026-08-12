import java.util.Scanner;

public class Salario2Scanner {
    public static void main(String[] args) {
        double sm, p, ns;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu salário mensal: ");
        sm = leia.nextDouble();
        System.out.println("Digite o percentual de reajuste salarial: ");
        p = leia.nextDouble();
        ns = sm + (sm * p)/100;
        System.out.println("Seu novo salário é de: " +ns + " reais");
    }
}
