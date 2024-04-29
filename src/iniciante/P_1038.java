package iniciante;

public class P_1038 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores inteiros e atribuição imediata
        final int CODIGO = sc.nextInt();
        final int QUANTIDADE = sc.nextInt();

        // Calculando o valor total a ser pago
        double valor = 0;
        switch (CODIGO) {
            case 1:
                valor = 4.0 * QUANTIDADE;
                break;
            case 2:
                valor = 4.5 * QUANTIDADE;
                break;
            case 3:
                valor = 5.0 * QUANTIDADE;
                break;
            case 4:
                valor = 2.0 * QUANTIDADE;
                break;
            case 5:
                valor = 1.5 * QUANTIDADE;
                break;
        }

        // Imprimindo o resultado conforme especificação do problema
        System.out.printf("Total: R$ %.2f\n", valor);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
