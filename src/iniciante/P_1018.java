package iniciante;

public class P_1018 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura do valor inteiro
        int valor = sc.nextInt();

        // Imprimindo o valor lido
        System.out.println(valor);

        // Calculando a quantidade de notas de 100
        int notas100 = valor / 100;
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        valor %= 100;

        // Calculando a quantidade de notas de 50
        int notas50 = valor / 50;
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        valor %= 50;

        // Calculando a quantidade de notas de 20
        int notas20 = valor / 20;
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        valor %= 20;

        // Calculando a quantidade de notas de 10
        int notas10 = valor / 10;
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        valor %= 10;

        // Calculando a quantidade de notas de 5
        int notas5 = valor / 5;
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        valor %= 5;

        // Calculando a quantidade de notas de 2
        int notas2 = valor / 2;
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        valor %= 2;

        // Calculando a quantidade de notas de 1
        int notas1 = valor;
        System.out.println(notas1 + " nota(s) de R$ 1,00");

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
