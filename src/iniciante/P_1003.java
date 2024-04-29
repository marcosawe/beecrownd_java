package iniciante;

public class P_1003 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores inteiros e atribuição imediata
        final int VAL1 = sc.nextInt();
        final int VAL2 = sc.nextInt();

        // Calculando a soma dos valores lidos
        final int SOMA = VAL1 + VAL2;

        // Imprimindo o resultado conforme especificação do problema
        System.out.println("SOMA = " + SOMA);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
