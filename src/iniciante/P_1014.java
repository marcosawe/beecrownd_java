package iniciante;

public class P_1014 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura da distância total percorrida
        final int DISTANCIA = sc.nextInt();

        // Leitura do total de combustível gasto
        final double COMBUSTIVEL = sc.nextDouble();

        // Calculando o consumo médio de combustível
        final double CONSUMO = DISTANCIA / COMBUSTIVEL;

        // Imprimindo o resultado conforme especificação do problema
        System.out.printf("%.3f km/l\n", CONSUMO);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
