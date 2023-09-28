import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int alternativa = 12, qualbanco = 5;
    Scanner ler = new Scanner(System.in);
    ContaPoupanca bancaria = new ContaPoupanca();
    ContaEspecial bancaria2 = new ContaEspecial();
    bancaria.saldo = 5435;  //considere saldo em centavos
    bancaria2.saldo = 3423; 
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
        System.out.println("Caso 0: Encerrar o programa da conta poupança");
        System.out.println("Escolha:");
        alternativa = ler.nextInt();
          switch(alternativa)
          {
            case 1:
            System.out.println("Você quer sacar dinheiro");
            break;
            case 2:
            System.out.printf("Nome: %s",bancaria.MostrarNome());
            break;
            case 3:
            System.out.printf("Saldo disponível: %d ", bancaria.MostrarSaldo());
            break;
            case 0:
            System.out.println("Você escolheu sair da conta poupança");
            break;
            default:
            System.out.println("Caso não valido");
            break;
          }
        }
        alternativa = 12;
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
          System.out.println("Caso 0: Encerrar o programa da conta especial");
          System.out.println("Escolha:");
          alternativa = ler.nextInt();
            switch(alternativa)
            {
              case 1:
              System.out.println("Você quer sacar dinheiro");
              break;
              case 2:
              System.out.printf("Nome: %s",bancaria2.MostrarNome());
              break;
              case 3:
              System.out.printf("Saldo disponível: %d ", bancaria2.MostrarSaldo());
              break;
              case 0:
              System.out.println("Você escolheu sair da conta poupança");
              break;
              default:
              System.out.println("Caso não valdo");
              break;
            }
        }
        alternativa = 12;
        break;
      }
    }
    System.out.println("Aplicação encerrada");
    ler.close();
  }
}