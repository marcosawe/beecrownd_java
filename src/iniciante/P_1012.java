package iniciante;

public class P_1012 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores inteiros e atribuição imediata
        final double A = sc.nextDouble();
        final double B = sc.nextDouble();
        final double C = sc.nextDouble();

        // Calculando as áreas conforme especificação do problema
        final double TRIANGULO = (A * C) / 2;
        final double CIRCULO = 3.14159 * Math.pow(C, 2);
        final double TRAPEZIO = ((A + B) * C) / 2;
        final double QUADRADO = Math.pow(B, 2);
        final double RETANGULO = A * B;

        // Imprimindo os resultados conforme especificação do problema
        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
