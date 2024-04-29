package iniciante;

public class P_1007 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores inteiros e atribuição imediata
        final int VAL1 = sc.nextInt();
        final int VAL2 = sc.nextInt();
        final int VAL3 = sc.nextInt();
        final int VAL4 = sc.nextInt();

        // Calculando a diferença de produto dos valores lidos
        final int DIFERENCAO_DO_PRODUTO = (VAL1 * VAL2) - (VAL3 * VAL4);

        // Imprimindo o resultado conforme especificação do problema
        System.out.println("DIFERENCA = " + DIFERENCAO_DO_PRODUTO);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
