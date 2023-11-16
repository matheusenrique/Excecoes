public class Question5 {
    private double lado1;
    private double lado2;
    private double lado3;

    public Question5(double lado1, double lado2, double lado3) throws DimensoesInvalidasException {
        if (!saoDimensoesValidas(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws DimensoesInvalidasException {
        if (!saoDimensoesValidas(lado1, this.lado2, this.lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo.");
        }
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws DimensoesInvalidasException {
        if (!saoDimensoesValidas(this.lado1, lado2, this.lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo.");
        }
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) throws DimensoesInvalidasException {
        if (!saoDimensoesValidas(this.lado1, this.lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo.");
        }
        this.lado3 = lado3;
    }

    private boolean saoDimensoesValidas(double a, double b, double c) {
        return a + b > c && Math.abs(a - b) < c && a + c > b && Math.abs(a - c) < b && b + c > a && Math.abs(b - c) < a;
    }

    public static void main(String[] args) {
        try {
            Question5 triangulo = new Question5(3, 4, 5);
            System.out.println("Triângulo criado com sucesso!");

            triangulo.setLado1(10);

            System.out.println("Digite três números para criar outro triângulo:");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            double lado1 = scanner.nextDouble();
            double lado2 = scanner.nextDouble();
            double lado3 = scanner.nextDouble();

            Triangulo outroTriangulo = new Triangulo(lado1, lado2, lado3);
            System.out.println("Outro triângulo criado com sucesso!");

            scanner.close();
        } catch (DimensoesInvalidasException e) {
            System.out.println("Erro ao criar triângulo: " + e.getMessage());
        }
    }
}

class DimensoesInvalidasException extends Exception {
    public DimensoesInvalidasException(String mensagem) {
        super(mensagem);
    }
}
