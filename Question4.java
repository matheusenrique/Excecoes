import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int indice = 0;

        try {
            while (true) {
                System.out.print("Digite um valor inteiro (ou 0 para encerrar): ");
                int valor = scanner.nextInt();

                if (valor == 0) {
                    break;
                }

                vetor[indice] = valor;
                indice++;

                if (indice == 10) {
                    System.out.println("O vetor está cheio. Não é possível adicionar mais valores.");
                    break;
                }
            }

            System.out.println("Valores no vetor:");

            for (int i = 0; i < indice; i++) {
                System.out.print(vetor[i] + " ");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um valor inteiro.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: O vetor não pode conter mais que 10 elementos.");
        } finally {
            scanner.close();
        }
    }
}
