package iniciante;

public class P_1064 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int count = 0;
        double sum = 0.0;
        for (int i = 0; i < 6; i++) {
            double number = sc.nextDouble();
            if (number > 0) {
                count++;
                sum += number;
            }
        }

        System.out.println(count + " valores positivos");
        System.out.printf("%.1f\n", sum / count);

        sc.close();
    }
}
