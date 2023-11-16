import java.util.InputMismatchException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = dividir(numero1, numero2);

            System.out.println("Resultado da divisão: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético: Divisão por zero não é permitida.");
        } finally {
            scanner.close();
        }
    }

    private static double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }
}
