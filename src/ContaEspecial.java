public class ContaEspecial extends Conta{
    public ContaEspecial(String noc, int numc, int salc, int limc, Agencia agc)
    {
        super(noc, numc, salc, limc, agc);
    }

    void TransferirContaPoupanca(ContaPoupanca nomeconta, int valor)
    {
        this.saldoConta -= valor;
        nomeconta.saldoConta += valor;
    }

    void PegarEmprestimo(int valor)
    {
        valor += ((valor*10)/100);
        System.out.println("Este é o valor que deverá ser pago em 90 dias");
    }
}

