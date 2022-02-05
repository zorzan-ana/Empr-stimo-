import java.util.Scanner;

public class ContaAgricultor extends Conta {

    public ContaAgricultor(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("---Extrato da Conta Agricultor:----");
        imprimirInfosComuns();
    }


    public int emprestimo;




}
