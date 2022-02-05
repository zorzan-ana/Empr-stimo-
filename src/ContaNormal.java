
public class ContaNormal extends Conta {

    public ContaNormal(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("---Extrato da Conta Normal:----");
        imprimirInfosComuns();
    }

}
