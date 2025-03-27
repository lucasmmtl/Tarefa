public class notebook {
    public static void main(String[] args) {
        String nomeProduto = "Notebook";
        double precoBase = 3500.0;
        double descontoPromocional = 200.0;
        double taxaEntrega = 50.0;
        double taxaServico = 100.0;

        precoBase -= descontoPromocional;
        precoBase += taxaEntrega;
        precoBase += taxaServico;

        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Preço original: " + (precoBase + descontoPromocional - taxaEntrega - taxaServico));
        System.out.println("Desconto promocional: " + descontoPromocional);
        System.out.println("Taxa de entrega: " + taxaEntrega);
        System.out.println("Taxa de serviço: " + taxaServico);
        System.out.println("Preço final: " + precoBase);
    }
}
