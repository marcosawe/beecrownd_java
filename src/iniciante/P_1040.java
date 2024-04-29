package iniciante;

public class P_1040 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura das notas e pesos
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        // Calculando a média
        double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4) / 10;

        // Imprimindo a média
        System.out.printf("Media: %.1f\n", media);

        // Verificando a situação do aluno
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double exame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exame);
            media = (media + exame) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", media);
        }

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
