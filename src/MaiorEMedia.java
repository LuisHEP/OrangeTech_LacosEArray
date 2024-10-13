import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int media = 0;
        int cont = 0;

        do {
            System.out.println("Digite o número: ");
            numero = scanner.nextInt();
            media = media + numero;
            if (numero > maiorNumero) maiorNumero = numero;
            cont++;
        } while (cont < 5);

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("A média é: " + (media / 5));
    }
}
