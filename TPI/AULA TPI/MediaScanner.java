import java.util.Scanner;

public class MediaScanner {
    public static void main(String[] args) {
        double n1, n2, n3, n4, n5, n6, m1, m2, soma;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a Nota 1: ");
        n1 = leia.nextDouble();
        System.out.println("Digite a Nota 2: ");
        n2 = leia.nextDouble();
        System.out.println("Digite a Nota 3: ");
        n3 = leia.nextDouble();
        m1 = (n1+n2+n3)/3;
        System.out.println("Digite a Nota 4: ");
        n4 = leia.nextDouble();
        System.out.println("Digite a Nota 5: ");
        n5 = leia.nextDouble();
        System.out.println("Digite a Nota 6: ");
        n6 = leia.nextDouble();
        m2 = (n4+n5+n6)/3;
        soma = (m1 + m2)/2;
        System.out.println("O resultado da média 1 é: " + m1);
        System.out.println("O resultado da média 2 é: " + m2);
        System.out.println("O resultado da média geral é: " + soma);
    }
}
