import java.util.Scanner;

public class RepeticaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota: ");
        nota = scanner.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scanner.nextInt();
        }
    }
}
