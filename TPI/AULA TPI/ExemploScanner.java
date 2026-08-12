import java.util.Scanner;
public class ExemploScanner {
    public static void main(String[] args) {
        //Declaração de variável
        double soma, subtracao, multiplicacao, divisao, num1, num2;

        //Comando para leitura de dados pelo teclado
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = leia.nextDouble();
        System.out.println("Digite um segundo número: ");
        num2 = leia.nextDouble();
        soma = num1 + num2;
        System.out.println("O resultado da soma é: " + soma);
        subtracao = num1 - num2;
        System.out.println("O resultado da subtração é: " + subtracao);
        multiplicacao = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        divisao = num1 / num2;
        System.out.println("O resultado da divisão é: " + divisao);
    }
}
