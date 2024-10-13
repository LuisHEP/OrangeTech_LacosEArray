import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFatorial;
        int multiplicador = 1;

        System.out.println("Digite o número: ");
        numeroFatorial = scanner.nextInt();

        for (int i = numeroFatorial; i >= 1; i--) {
            multiplicador = multiplicador * i;
        }

        System.out.println("O fatorial de " + numeroFatorial + " é " + multiplicador);
    }
}
