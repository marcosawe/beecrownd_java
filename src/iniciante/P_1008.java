package iniciante;

public class P_1008 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores inteiros e atribuição imediata
        final int NUMERO_FUNCIONARIO = sc.nextInt();
        final int HORAS_TRABALHADAS = sc.nextInt();
        final double VALOR_HORA = sc.nextDouble();

        // Calculando o salário do funcionário
        final double SALARIO = HORAS_TRABALHADAS * VALOR_HORA;

        // Imprimindo o resultado conforme especificação do problema
        System.out.println("NUMBER = " + NUMERO_FUNCIONARIO);
        System.out.printf("SALARY = U$ %.2f\n", SALARIO);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
