package iniciante;

public class P_1002 {
    public static void main(String[] args) {
        // Definindo Scanner
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Definindo a constante pi
        final double PI = 3.14159;

        // Lendo o valor do raio da entrada padrão
        final double raio = scanner.nextDouble();

        // Calculando a área usando a fórmula da área do círculo: A = π * r^2
        final double area = PI * (raio * raio);

        // Imprimindo a área com quatro casas decimais
        System.out.printf("A=%.4f%n", area);

        // Fechando o scanner
        scanner.close();
    }
}

