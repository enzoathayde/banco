import java.util.Calendar;

public class ContaEspecial extends ContaPoupanca {
  
  void TransferirContaPoupanca(ContaPoupanca nomeconta, int valor)
  {
    this.saldo -= valor;
    nomeconta.saldo += valor;
  }

}
