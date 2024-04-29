package iniciante;

public class P_1061 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        scanner.next();
        int diaInicio = scanner.nextInt();
        int horaInicio = scanner.nextInt();
        scanner.next();
        int minutoInicio = scanner.nextInt();
        scanner.next();
        int segundoInicio = scanner.nextInt();

        scanner.next();
        int diaFim = scanner.nextInt();
        int horaFim = scanner.nextInt();
        scanner.next();
        int minutoFim = scanner.nextInt();
        scanner.next();
        int segundoFim = scanner.nextInt();

        scanner.close();

        int duracao = 0;
        if (horaFim == horaInicio && minutoFim == minutoInicio && segundoFim == segundoInicio) {
            duracao = 24 * 60 * 60;
        } else {
            int duracaoInicio = diaInicio * 24 * 60 * 60 + horaInicio * 60 * 60 + minutoInicio * 60 + segundoInicio;
            int duracaoFim = diaFim * 24 * 60 * 60 + horaFim * 60 * 60 + minutoFim * 60 + segundoFim;
            duracao = duracaoFim - duracaoInicio;
        }

        int dias = duracao / (24 * 60 * 60);
        duracao %= 24 * 60 * 60;
        int horas = duracao / (60 * 60);
        duracao %= 60 * 60;
        int minutos = duracao / 60;
        duracao %= 60;
        int segundos = duracao;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
