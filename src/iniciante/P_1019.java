package iniciante;

public class P_1019 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura do tempo em segundos
        int tempo = sc.nextInt();

        // Calculando as horas, minutos e segundos
        int horas = tempo / 3600;
        tempo %= 3600;
        int minutos = tempo / 60;
        tempo %= 60;
        int segundos = tempo;

        // Imprimindo o resultado conforme especificação do problema
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
