package iniciante;

public class P_1013 {

    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores inteiros e atribuição imediata
        final int VAL1 = sc.nextInt();
        final int VAL2 = sc.nextInt();
        final int VAL3 = sc.nextInt();

        // Calculando o maior valor entre os três lidos
        final int MAIOR = Math.max(VAL1, Math.max(VAL2, VAL3));

        // Imprimindo o resultado conforme especificação do problema
        System.out.println(MAIOR + " eh o maior");

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}