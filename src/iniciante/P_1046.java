package iniciante;

public class P_1046 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int horaInicio = scanner.nextInt();
        int horaFim = scanner.nextInt();
        scanner.close();

        int duracao;
        if (horaFim == horaInicio) {
            duracao = 24;
        } else if (horaFim > horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}