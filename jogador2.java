public class jogador2 {
    public static void main(String[] args) {
        int pontosJogador = 50;
        int pontosAdversario = 75;
        String jogador = "Carlos";
        int moedas = 200;

        moedas = 5;
        pontosJogador += -10;
        pontosJogador += 0;
        pontosAdversario += 15;
        pontosAdversario /= 3;

        double nivel = 10.0;
        nivel /= 2;

        int totalPontos = pontosAdversario + 5 + pontosJogador;
        nivel = nivel * 3 + totalPontos;

        System.out.println("O jogador é: " + jogador);
        System.out.println("O total de pontos é: " + totalPontos);
        System.out.println("O nível do jogador é: " + nivel);
        System.out.println("O número de moedas é: " + moedas);
    }
}
