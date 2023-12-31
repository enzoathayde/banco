import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Main
{
  public static void main(String[] args)
  {
    int alternativa = 1, qualbanco = 1, qualdeposito = 1, transferir = 1, ano = 2023, mes = 9, dia = 6, emprestimo = 1;
    Scanner ler = new Scanner(System.in);
    Calendar dataAtual = Calendar.getInstance();
    ContaPoupanca bancaria = new ContaPoupanca();
    ContaEspecial bancaria2 = new ContaEspecial();
    bancaria.saldo = 54;  //considere saldo em centavos
    bancaria2.saldo = 34; 
    bancaria.nomeCliente = "Enzo Athayde";
    bancaria2.nomeCliente = "Lucas Padua";
    bancaria.limite = 300;
    bancaria2.limite = 200;
    Calendar rendimento = Calendar.getInstance();
    rendimento.set(Calendar.YEAR,ano);
    rendimento.set(Calendar.MONTH,mes);
    rendimento.set(Calendar.DAY_OF_WEEK,dia);
    Date data = rendimento.getTime();
    Date data2 = dataAtual.getTime();
    
    System.out.println(data);
    System.out.println(data2);

    while(qualbanco != 0)
    {
      System.out.println("Informe 1 para acessar conta poupança, 2 para acessar a conta especial e 0 para encerrar a aplicação:");
      System.out.println("Atual data " +dataAtual.get(Calendar.YEAR) +"/"+ dataAtual.get(Calendar.MONTH) +"/"+dataAtual.get(Calendar.DAY_OF_MONTH));
      if (dataAtual.get(Calendar.YEAR) == rendimento.get(Calendar.YEAR) && dataAtual.get(Calendar.MONTH) == rendimento.get(Calendar.MONTH) && dataAtual.get(Calendar.DAY_OF_WEEK) == rendimento.get(Calendar.DAY_OF_WEEK))
      {
        System.out.println("Rendimento e empréstimo disponíveis para sua conta");
        bancaria.DarRendimento();
      } else  
            {
              System.out.println("Data não permite empréstimos e rendimentos");
            }
      qualbanco = ler.nextInt();
      switch(qualbanco)
      {
        case 1:
        System.out.println("Você acessou a conta poupança");
        while (alternativa != 0)
        { 
        System.out.println("Caso 1: Sacar dinheiro");
        System.out.println("Caso 2: Mostrar nome do títular");
        System.out.println("Caso 3: Mostrar saldo da conta ");
        System.out.println("Caso 4: Depositar dinheiro ");
        System.out.println("Caso 5: Transferir dinheiro para conta especial");
        System.out.println("Caso 0: Encerrar o programa da conta poupança");
        System.out.println("Escolha:");
        alternativa = ler.nextInt();
          switch(alternativa)
          {
            case 1:
            System.out.println("Informe o valor(limite):");
            qualbanco = ler.nextInt();
            bancaria.Sacar(qualbanco);
            break;
            case 2:
            System.out.printf("Nome: %s",bancaria.MostrarNome());
            break;
            case 3:
            System.out.printf("Saldo disponível: %d ", bancaria.MostrarSaldo());
            break;
            case 4:
            System.out.println("Informe a quantidade a ser depositada");
            qualdeposito = ler.nextInt();
            bancaria.Depositar(qualdeposito);
            break;
            case 5:
            System.out.println("Informe a quantidade a transferir:");
            transferir = ler.nextInt();
            bancaria.TransferirContaEspecial(bancaria2, transferir);
            break;
            case 0:
            System.out.println("Você escolheu sair da conta poupança");
            break;
            default:
            System.out.println("Caso não valido");
            break;
          }
        }
        alternativa = 1;
        break;
        case 0:
        System.out.println("Você escolheu encerrar a aplicação");
        break;
        case 2:
        System.out.println("Você acessou conta especial");
        while (alternativa != 0)
        { 
          System.out.println("Caso 1: Sacar dinheiro");
          System.out.println("Caso 2: Mostrar nome do títular");
          System.out.println("Caso 3: Mostrar saldo da conta ");
          System.out.println("Caso 4: Depositar dinheiro ");
          System.out.println("Caso 5: Transferir dinheiro para conta especial");
          System.out.println("Caso 6 : Pegar empréstimo na conta especial");
          System.out.println("Caso 0: Encerrar o programa da conta especial");
          System.out.println("Escolha:");
          alternativa = ler.nextInt();
            switch(alternativa)
            {
              case 1:
              System.out.println("Informe o valor(limite):");
              qualbanco = ler.nextInt();
              bancaria2.Sacar(qualbanco);
              break;
              case 2:
              System.out.printf("Nome: %s",bancaria2.MostrarNome());
              break;
              case 3:
              System.out.printf("Saldo disponível: %d ", bancaria2.MostrarSaldo());
              break;
              case 4:
              System.out.println("Informe a quantidade a ser depositada");
              qualdeposito = ler.nextInt();
              bancaria2.Depositar(qualdeposito);
              break;
              case 5:
              System.out.println("Informe a quantidade a transferir:");
              transferir = ler.nextInt();
              bancaria2.TransferirContaPoupanca(bancaria, transferir);
              break;
              case 6:
              System.out.println("Informe a quantidade a ser pega: ");
              emprestimo = ler.nextInt();
              bancaria2.PegarEmprestimo(emprestimo);
              break;
              case 0:
              System.out.println("Você escolheu sair da conta poupança");
              break;
              default:
              System.out.println("Caso não valdo");
              break;
            }
        }
        alternativa = 1;
        break;
      }
    }
    System.out.println("Aplicação encerrada");
    ler.close();
  }
}