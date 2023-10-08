// import java.util.Calendar;
// import java.util.Date;

public class ContaPoupanca {
  int numeroConta, agencia, saldo, limite;
  String nomeCliente;

  void Sacar(float saque)
  {
    if(saque > saldo || saque > limite)
    {
      System.out.println("Transação indisponível, saldo insuficiente ou limite acima do permitido");
    } else 
          {
            saldo -= saque;
            System.out.println("Saque realizado");
          }
  }

  void Depositar(float deposito)
  {
    saldo += deposito;
    System.out.println("Depósito realizado com sucesso");
  }

  String MostrarNome()
  {
    return nomeCliente;
  }

  void TransferirContaEspecial(ContaEspecial nomeconta, int valor)
  {
    this.saldo -= valor;
    nomeconta.saldo += valor;
  }

  int MostrarSaldo()
  {
    return saldo;
  }

  void DarRendimento()
  { 
    saldo += ((saldo*0.5) /100);
    System.out.println("Rendimento incluso na sua conta.");
  }

}
