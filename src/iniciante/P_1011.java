package iniciante;

public class P_1011 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura do raio da esfera
        final double RAIO = sc.nextDouble();

        // Calculando o volume da esfera
        final double VOLUME = (4.0 / 3) * 3.14159 * Math.pow(RAIO, 3);

        // Imprimindo o resultado conforme especificação do problema
        System.out.printf("VOLUME = %.3f\n", VOLUME);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
