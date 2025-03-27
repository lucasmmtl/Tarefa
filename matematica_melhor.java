import javax.swing.JOptionPane;

public class Matematica_melhor {
    public static void main(String [] args){    
        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1) Soma\n2) Multiplicação\n3) Divisão\n4) Subtração"));

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        if(escolha == 1){
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " a soma dos números é: " + soma(num1, num2));
        }else{
            if(escolha == 2){
                JOptionPane.showMessageDialog(null, "Olá, " + nome + " a multiplicação dos números é: " + multiplicacao(num1, num2));
            }else{
                if(escolha == 3){
                    JOptionPane.showMessageDialog(null, "Olá, " + nome + " a divisão dos números é: " + divisao(num1, num2));
            }else{
                JOptionPane.showMessageDialog(null, "Olá, " + nome + " a subtração dos números é: " + subtracao(num1, num2));
                }
            }
        }
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }
    
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }
}
