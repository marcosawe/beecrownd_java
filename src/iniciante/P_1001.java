package iniciante;

public class P_1001 {
    public static void main(String[] args) {
        // Inicializa o Scanner para leitura dos dados de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Lê os dois valores inteiros da entrada
        final int A = sc.nextInt();
        int B = sc.nextInt();

        // Calcula a soma dos dois valores
        final int C = A + B;

        // Imprime o resultado seguindo o formato especificado
        System.out.println("X = " + C);  // Usando println para incluir quebra de linha

        // Fecha o scanner
        sc.close();
    }
}

