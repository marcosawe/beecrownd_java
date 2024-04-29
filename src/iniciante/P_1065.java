package iniciante;

public class P_1065 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() % 2 == 0) {
                count++;
            }
        }

        System.out.println(count + " valores pares");

        sc.close();
    }
}
