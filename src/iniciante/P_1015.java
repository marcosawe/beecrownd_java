package iniciante;

public class P_1015 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura das coordenadas do primeiro ponto
        final double X1 = sc.nextDouble();
        final double Y1 = sc.nextDouble();

        // Leitura das coordenadas do segundo ponto
        final double X2 = sc.nextDouble();
        final double Y2 = sc.nextDouble();

        // Calculando a distância entre os dois pontos
        final double DISTANCIA = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

        // Imprimindo o resultado conforme especificação do problema
        System.out.printf("%.4f\n", DISTANCIA);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
