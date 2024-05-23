public class ContaPoupanca extends Conta{
    public ContaPoupanca(String noc, int numc, int salc, int limc, Agencia agc)
    {
        super(noc, numc, salc, limc, agc);
    }

    void DarRendimento()
    {
        saldoConta += (int) ((saldoConta*0.5) /100);
        System.out.println("Rendimento incluso na sua conta.");
    }

    void TransferirContaEspecial(ContaEspecial nomeconta, int valor)
    {
        this.saldoConta -= valor;
        nomeconta.saldoConta += valor;
    }

}
