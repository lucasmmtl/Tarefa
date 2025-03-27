public class Inss {
    public static void main(String[] args) {
        String nomeFuncionario = "Maria";
        double salarioBase = 2500.0;
        double bonus = 300.0;
        double descontoINSS = 250.0;
        double descontoValeTransporte = 150.0;
        
        salarioBase += bonus;
        salarioBase -= descontoINSS;
        salarioBase -= descontoValeTransporte;
        
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário total: " + (salarioBase + bonus + descontoINSS + descontoValeTransporte));
        System.out.println("Bônus: " + bonus);
        System.out.println("Desconto INSS: " + descontoINSS);
        System.out.println("Desconto Vale Transporte: " + descontoValeTransporte);
        System.out.println("Salário líquido: " + salarioBase);
    }
}
