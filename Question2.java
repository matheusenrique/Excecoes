import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> idades = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            try {
                int idade = scanner.nextInt();
                idades.add(idade);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine();
                i--;
            }
        }

        System.out.println("Lista de idades: " + idades);

        System.out.print("Digite o número da posição a ser removida: ");
        try {
            int posicao = scanner.nextInt();

            if (posicao < 1 || posicao > idades.size()) {
                System.out.println("Posição inválida. A posição deve estar entre 1 e " + idades.size());
            } else {
                idades.remove(posicao - 1);
                System.out.println("Idade removida com sucesso.");
                System.out.println("Lista de idades atualizada: " + idades);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        scanner.close();
    }

}
