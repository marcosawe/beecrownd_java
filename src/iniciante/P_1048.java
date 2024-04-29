package iniciante;

public class P_1048 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double salario = sc.nextDouble();
        double novoSalario = 0;
        double reajuste = 0;
        int percentual = 0;

        if (salario <= 400.0) {
            percentual = 15;
            reajuste = salario * 0.15;
        } else if (salario <= 800.0) {
            percentual = 12;
            reajuste = salario * 0.12;
        } else if (salario <= 1200.0) {
            percentual = 10;
            reajuste = salario * 0.10;
        } else if (salario <= 2000.0) {
            percentual = 7;
            reajuste = salario * 0.07;
        } else {
            percentual = 4;
            reajuste = salario * 0.04;
        }

        novoSalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        sc.close(); 
    }
}
