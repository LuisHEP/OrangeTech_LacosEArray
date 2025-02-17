import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[5];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for(int numeros: numerosAleatorios) {
            System.out.print(numeros + " ");
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for(int numeros: numerosAleatorios) {
            System.out.print((numeros + 1) + " ");
        }

        System.out.println("\nAntecessores dos números aleatórios: ");
        for(int numeros: numerosAleatorios) {
            System.out.print((numeros - 1) + " ");
        }
    }
}
