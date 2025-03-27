public class Gol {
    public static void main(String[] args) {
        int gols = 2;
        int assistencias = 1;
        String jogador = "Matheus";

        int faltasCometidas = 3;
        faltasCometidas = 2;

        gols += 1;
        assistencias += 2;
        faltasCometidas -= 1;

        double nota = 7.5;
        nota *= 1.2;

        int participacoes = gols + assistencias;
        nota = nota + participacoes;

        System.out.println("Jogador: " + jogador);
        System.out.println("Gols marcados: " + gols);
        System.out.println("Assistências: " + assistencias);
        System.out.println("Faltas cometidas: " + faltasCometidas);
        System.out.println("Nota final: " + nota);
    }
}
