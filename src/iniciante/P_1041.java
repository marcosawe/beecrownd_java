package iniciante;

public class P_1041 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores reais e atribuição imediata
        final double X = sc.nextDouble();
        final double Y = sc.nextDouble();

        // Verificando em qual quadrante o ponto se encontra
        if (X == 0 && Y == 0) {
            System.out.println("Origem");
        } else if (X == 0) {
            System.out.println("Eixo Y");
        } else if (Y == 0) {
            System.out.println("Eixo X");
        } else if (X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
