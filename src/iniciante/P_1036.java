package iniciante;

public class P_1036 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores double e atribuição imediata
        final double A = sc.nextDouble();
        final double B = sc.nextDouble();
        final double C = sc.nextDouble();

        // Calculando o delta
        double delta = Math.pow(B, 2) - 4 * A * C;

        // Verificando se é possível calcular as raízes
        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            // Calculando as raízes
            double r1 = (-B + Math.sqrt(delta)) / (2 * A);
            double r2 = (-B - Math.sqrt(delta)) / (2 * A);

            // Imprimindo o resultado conforme especificação do problema
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }

        // Fechando o Scanner para liberar recursos
        sc.close();
    }    
}
