public class velocidade {
    public static void main(String[] args) {
        int velocidadeMedia = 80;
        int consumoMedio = 12;
        String modelo = "Chevrolet Vectra";

        int distanciaPercorrida = 500;
        distanciaPercorrida += 100;
        velocidadeMedia += 10;
        velocidadeMedia -= 5;
        consumoMedio -= 2;

        double combustivelGasto = (double) distanciaPercorrida / consumoMedio;
        int tempoViagem = distanciaPercorrida / velocidadeMedia;

        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        System.out.println("Distância percorrida: " + distanciaPercorrida + " km");
        System.out.println("Consumo médio: " + consumoMedio + " km/l");
        System.out.println("Combustível gasto: " + combustivelGasto + " litros");
        System.out.println("Tempo estimado de viagem: " + tempoViagem + " horas");
    }
}
