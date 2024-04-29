package iniciante;

public class P_1017 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura do tempo gasto na viagem em horas
        final int TEMPO = sc.nextInt();

        // Leitura da velocidade média do veículo em km/h
        final int VELOCIDADE = sc.nextInt();

        // Calculando a distância percorrida em km
        final double DISTANCIA = TEMPO * VELOCIDADE;

        // Calculando a quantidade de litros de combustível gastos
        final double LITROS = DISTANCIA / 12;

        // Imprimindo o resultado conforme especificação do problema
        System.out.printf("%.3f\n", LITROS);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
