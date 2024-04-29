package iniciante;

public class P_1021 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura do valor de entrada
        double valor = sc.nextDouble();

        // Calculando as notas e moedas
        int notas = (int) valor;
        int moedas = (int) ((valor - notas) * 100);

        int[] notasDisponiveis = {100, 50, 20, 10, 5, 2};
        int[] moedasDisponiveis = {100, 50, 25, 10, 5, 1};

        // Imprimindo o valor lido
        System.out.println("NOTAS:");
        for (int nota : notasDisponiveis) {
            System.out.printf("%d nota(s) de R$ %d.00\n", notas / nota, nota);
            notas %= nota;
        }

        // Imprimindo o valor lido
        System.out.println("MOEDAS:");
        for (int moeda : moedasDisponiveis) {
            System.out.printf("%d moeda(s) de R$ %.2f\n", moedas / moeda, moeda / 100.0);
            moedas %= moeda;
        }

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
