import java.awt.font.TextHitInfo;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected int saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta =  SEQUENCIAL++;
        this.cliente =  cliente;
    }

    public Conta () {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

        public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
      saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }


    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %d", this.saldo));
    }
}