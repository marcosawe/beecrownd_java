package iniciante;

public class P_1010 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores inteiros e atribuição imediata
        final int CODIGO_P1 = sc.nextInt();
        final int NUMERO_PECAS_P1 = sc.nextInt();
        final double VALOR_UNITARIO_P1 = sc.nextDouble();

        final int CODIGO_P2 = sc.nextInt();
        final int NUMERO_PECAS_P2 = sc.nextInt();
        final double VALOR_UNITARIO_P2 = sc.nextDouble();

        // Calculando o valor total a ser pago
        final double VALOR_TOTAL = (NUMERO_PECAS_P1 * VALOR_UNITARIO_P1) + (NUMERO_PECAS_P2 * VALOR_UNITARIO_P2);

        // Imprimindo o resultado conforme especificação do problema
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", VALOR_TOTAL);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
