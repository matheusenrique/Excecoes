import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = s.nextLine();
        System.out.println("Digite um número: ");
        try {
            String numStr = s.nextLine();
            int num = Integer.parseInt(numStr);

            if (num >= 0 && num < nome.length()) {
                char letra = nome.charAt(num);
                System.out.println("Posição: " + num + ", letra: " + letra);
            } else
                System.out.println("Digite um número válido.");

        } catch (Exception e) {
            System.out.println("Posição inválida. Digite um número válido.");
        }
    }
}