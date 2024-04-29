package iniciante;

public class P_1020 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura da idade em dias
        int idadeDias = sc.nextInt();

        // Calculando os anos, meses e dias
        int anos = idadeDias / 365;
        idadeDias %= 365;
        int meses = idadeDias / 30;
        idadeDias %= 30;
        int dias = idadeDias;

        // Imprimindo o resultado conforme especificação do problema
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
