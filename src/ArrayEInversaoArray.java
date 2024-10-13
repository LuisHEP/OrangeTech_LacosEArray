public class ArrayEInversaoArray {
    public static void main(String[] args) {
        int[] vetor = {-4, -3, 0, 10, 14};

        for (int x = 0; x < vetor.length; x++) {
            System.out.print(vetor[x] + " ");
        }

        System.out.println();

        for (int y = (vetor.length -1); y >= 0; y--) {
            System.out.print(vetor[y] + " ");
        }
    }
}
