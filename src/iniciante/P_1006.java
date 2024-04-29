package iniciante;

public class P_1006 {
    public static void main(String[] args) {

        // Definindo Scanner
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Lendo as três notas do aluno
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Pesos das notas A, B e C
        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;
        double somaPesos = pesoA + pesoB + pesoC;

        // Calculando a média ponderada
        double MEDIA = (A * pesoA + B * pesoB + C * pesoC) / somaPesos;

        // Imprimindo a média com o formato especificado
        System.out.printf("MEDIA = %.1f%n", MEDIA);

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
