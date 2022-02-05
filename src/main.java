import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Cliente AnaGabriela = new Cliente();
        AnaGabriela.setNome("Ana Gabriela");

        Conta Normal = new ContaNormal (AnaGabriela);
        Conta Agricultor =  new ContaAgricultor(AnaGabriela);




        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu tipo de conta?");
        System.out.println("1-Conta para agricultores");
        System.out.println("2-Conta Normal");


        int tipoConta = entrada.nextInt();


        if (tipoConta == 1) {
            Agricultor.imprimirExtrato();
            System.out.println("Você aceita um empréstimo?");
            System.out.println("1-Sim");
            System.out.println("2-Não");
            int emprestimo = entrada.nextInt();
            if (emprestimo == 1) {
                System.out.println("Qual o valor que desejas?");
                double valor = entrada.nextInt();
                System.out.println("Seu empréstimo é de: " + valor);
                double juros = valor * 0.02;
                double valorTotal = juros + valor;
                System.out.println("O total do seu empréstimo é de:" + valorTotal);
            }
            else System.out.println("Tchau");
        }
        else  Normal.imprimirExtrato();




    }
}
