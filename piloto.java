public class piloto {
    public static void main(String[] args) {
        int voltas = 1;
        int posicao = 2;
        String piloto = "Schumacher";
        int velocidadeMaxima = 300;
        
        velocidadeMaxima = 1;
        voltas += -1;
        voltas += 0;
        posicao += 2;
        posicao /= 4;
        
        double tempoCorrida = 400.0;
        tempoCorrida /= 2;
        
        int totalPontos = posicao + 1 + voltas;
        tempoCorrida = tempoCorrida * 2 + totalPontos;
        
        System.out.println("O piloto é: " + piloto);
        System.out.println("A pontuação final é: " + totalPontos);
        System.out.println("O tempo total da corrida foi: " + tempoCorrida + " segundos");
        System.out.println("A velocidade máxima registrada foi: " + velocidadeMaxima + " km/h");
    }
}
