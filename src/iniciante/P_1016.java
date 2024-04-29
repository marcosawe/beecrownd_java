package iniciante;

public class P_1016 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura da distância em quilômetros
        final int DISTANCIA = sc.nextInt();

        // Calculando o tempo em minutos
        final int TEMPO = DISTANCIA * 2;

        // Imprimindo o resultado conforme especificação do problema
        System.out.println(TEMPO + " minutos");

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
