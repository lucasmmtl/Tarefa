public class Jogador {
    public static void main(String[] args) {
        int pontosIniciais = 500;
        int bonus = 100;
        String jogador = "João";
        int penalidade = 50;
        
        pontosIniciais += 200;
        bonus += 50;
        penalidade -= 20;
        
        int pontosTotais = pontosIniciais + bonus - penalidade;
        
        double multiplicador = 1.5;
        pontosTotais *= multiplicador;
        
        System.out.println("Jogador: " + jogador);
        System.out.println("Pontos iniciais: " + pontosIniciais);
        System.out.println("Bônus: " + bonus);
        System.out.println("Penalidade: " + penalidade);
        System.out.println("Pontuação final: " + pontosTotais);
    }
}
