// import java.util.Calendar;

public class ContaEspecial extends ContaPoupanca {
  
  void TransferirContaPoupanca(ContaPoupanca nomeconta, int valor)
  {
    this.saldo -= valor;
    nomeconta.saldo += valor;
  }

  void PegarEmprestimo(int valor)
  {
    valor += ((valor*10)/100);
    System.out.println("Este é o valor que deverá ser pago em 90 dias");
  }
}
