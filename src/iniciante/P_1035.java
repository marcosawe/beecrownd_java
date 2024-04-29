package iniciante;

public class P_1035 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores inteiros e atribuição imediata
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int C = sc.nextInt();
        final int D = sc.nextInt();

        // Verificando as condições
        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        // Fechando o Scanner para liberar recursos
        sc.close();
    }    
}