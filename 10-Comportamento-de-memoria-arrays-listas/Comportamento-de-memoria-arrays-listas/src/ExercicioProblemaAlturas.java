import java.util.Scanner;

public class ExercicioProblemaAlturas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double soma = 0.0;
        double media = 0.0;
        double porcentagem = 0.0;
        int quantidadePessoasMenoresDeDezesseis = 0;
        Pessoa[] vect = new Pessoa[n];

        for(int i = 0; i < vect.length; i ++){
            System.out.printf("Dados da %d a pessoa %n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome,idade,altura);
        }

        for(int i = 0; i < vect.length; i ++){
            soma += vect[i].getAltura();
            if(vect[i].getIdade() < 16) {
                quantidadePessoasMenoresDeDezesseis ++;
                System.out.println(quantidadePessoasMenoresDeDezesseis);

            }
        }
         media = soma / n;
         porcentagem = ((double)quantidadePessoasMenoresDeDezesseis / n) * 100;

        System.out.printf("Altura média: %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",porcentagem);

        for(int i = 0; i < vect.length; i ++){
            if(vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }
        sc.close();
    }
}
