package iniciante;

public class P_1005 {
    public static void main(String[] args) {


        // Definindo Scanner
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Lendo os valores da média na entrada padrão
        final double A = scanner.nextDouble();
        final double B = scanner.nextDouble();

        // Pesos para as notas A e B
        double pesoA = 3.5;
        double pesoB = 7.5;
        double somaPesos = pesoA + pesoB;

        // Atribuindo uma conta de média;
        final double media = (A * pesoA + B * pesoB) / somaPesos;

        // Imprimindo a média com quatro casas decimais
        System.out.printf("A=%.5f%n", media);

        // Fechando o scanner
        scanner.close();
    }
}
