public class salario {
    public static void main(String[] args) {
        int salarioBase = 3000;
        int bonus = 500;
        String funcionario = "Lucas";

        int desconto = 200;
        desconto = 150;

        salarioBase += 200;
        salarioBase -= 100;
        bonus *= 2;
        bonus /= 4;

        double imposto = 1000;
        imposto /= 2;

        int salarioFinal = salarioBase + bonus - desconto;
        imposto = imposto * 1.5 + salarioFinal;

        System.out.println("Funcionário: " + funcionario);
        System.out.println("Salário Final: " + salarioFinal);
        System.out.println("Valor do Imposto Ajustado: " + imposto);
        System.out.println("Desconto Aplicado: " + desconto);
    }
}
