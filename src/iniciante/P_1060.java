package iniciante;

public class P_1060 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (sc.nextDouble() > 0) {
                count++;
            }
        }

        System.out.println(count + " valores positivos");

        sc.close();
    }
}