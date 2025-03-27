public class Nota {
    public static void main(String[] args) {
        String nome = "Junior";
        double nota1 = 9.5;
        double nota2 = 4.7;
        double nota3 = 6.9;
        double nota4 = 3.4;
        
        nota1 += 0.5;
        nota2 -= 0.8;
        nota3 += 3.1;
        nota4 = 6.3;
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("Meu nome é " + nome);
        System.out.println("Nota1 final: " + nota1);
        System.out.println("Nota2 final: " + nota2);
        System.out.println("Nota3 final: " + nota3);
        System.out.println("Nota4 final: " + nota4);
        System.out.println("Média final: " + media);
    }
}
