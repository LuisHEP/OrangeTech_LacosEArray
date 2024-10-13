import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int numerosPares = 0, numerosImpares = 0;
        int cont = 0;

        System.out.println("Digite a quantidade de números: ");
        quantNumeros = scanner.nextInt();

        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0) numerosPares++;
            else numerosImpares++;
            cont++;
        } while (cont < quantNumeros);

        System.out.println("A quantidade de números pares é: " + numerosPares);
        System.out.println("A quantidade de números ímpares é: " + numerosImpares);
    }
}
