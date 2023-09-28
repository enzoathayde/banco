import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int alternativa = 1, qualbanco = 1, qualdeposito = 1;
    Scanner ler = new Scanner(System.in);
    ContaPoupanca bancaria = new ContaPoupanca();
    ContaEspecial bancaria2 = new ContaEspecial();
    bancaria.saldo = 54;  //considere saldo em centavos
    bancaria2.saldo = 34; 
    bancaria.nomeCliente = "Enzo Athayde";
    bancaria2.nomeCliente = "Lucas Padua";
    bancaria.limite = 300;
    bancaria2.limite = 200;



    while(qualbanco != 0)
    {
      System.out.println("Informe 1 para acessar conta poupança, 2 para acessar a conta especial e 0 para encerrar a aplicação:");
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