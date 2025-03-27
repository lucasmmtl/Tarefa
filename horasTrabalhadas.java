public class HorasTrabalhadas {
    public static void main(String[] args) {
        int horasTrabalhadas = 160;
        double salarioPorHora = 25.5;
        String funcionario = "Vitor";

        double bonus = 300.0;
        horasTrabalhadas += 10;
        salarioPorHora += 2.5;
        bonus -= 50;

        double salarioBase = horasTrabalhadas * salarioPorHora;
        double salarioFinal = salarioBase + bonus;

        System.out.println("Funcionário: " + funcionario);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Salário por hora: R$" + salarioPorHora);
        System.out.println("Bônus recebido: R$" + bonus);
        System.out.println("Salário base: R$" + salarioBase);
        System.out.println("Salário final: R$" + salarioFinal);
    }
}
