package iniciante;

public class P_1047 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int duracaoHoras = horaFinal - horaInicial;
        int duracaoMinutos = minutoFinal - minutoInicial;

        if (duracaoHoras <= 0) {
            duracaoHoras += 24;
        }

        if (duracaoHoras == 24 && duracaoMinutos > 0) {
            duracaoHoras = 0;
        }

        if (duracaoMinutos < 0) {
            duracaoMinutos += 60;
            duracaoHoras--;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);

        sc.close();
    }
}