package iniciante;

public class P_1045 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double[] lados = new double[3];
        for (int i = 0; i < 3; i++) {
            lados[i] = sc.nextDouble();
        }

        java.util.Arrays.sort(lados);

        double A = lados[2];
        double B = lados[1];
        double C = lados[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}
