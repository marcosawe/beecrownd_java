package iniciante;
public class P_1009 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores inteiros e atribuição imediata
        final String NOME = sc.next();
        final double SALARIO_FIXO = sc.nextDouble();
        final double TOTAL_VENDAS = sc.nextDouble();

        // Calculando o salário do funcionário
        final double SALARIO = SALARIO_FIXO + (TOTAL_VENDAS * 0.15);

        // Imprimindo o resultado conforme especificação do problema
        System.out.printf("TOTAL = R$ %.2f\n", SALARIO);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
