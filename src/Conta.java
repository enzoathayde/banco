public class Conta {
    String nomeConta;
    int numeroConta, saldoConta, limiteConta;
    Agencia agenciaConta;

    public Conta(String noc, int numc, int salc, int limc, Agencia agc) {
        this.nomeConta = noc;
        this.numeroConta = numc;
        this.saldoConta = salc;
        this.limiteConta = limc;
        this.agenciaConta = agc;
    }

    void Sacar(int saque)
    {
        if(saque > saldoConta || saque > limiteConta)
        {
            System.out.println("Transação indisponível, saldo insuficiente ou limite acima do permitido");
        } else
        {
            saldoConta -= saque;
            System.out.println("Saque realizado");
        }
    }

    void Depositar(int deposito)
    {
        saldoConta += deposito;
        System.out.println("Depósito realizado com sucesso");
    }

    int MostrarSaldo()
    {
        return saldoConta;
    }


}
