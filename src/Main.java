
import java.sql.SQLOutput;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
            Agencia agenciaUm = new Agencia("jurerê",1);
            ContaPoupanca contaPoupancaUm = new ContaPoupanca("Enzo Athayde",0001,1000,10000,agenciaUm);
            ContaEspecial contaEspecialUm = new ContaEspecial("Jules Jean",0002,1000,10000,agenciaUm);
            int alternativa = 23874873;
            int alternativaPoupanca = 239849823;
            int alternativaEspecial = 239848234;
            Scanner leitura = new Scanner(System.in);

            System.out.println("Acessando menu principal....");

            while(!(alternativa == 0)) {
                System.out.println("1. Acessar conta Especial existente");
                System.out.println("2. Acessar conta Poupança existente");
                System.out.println("0. Sair");
                alternativa = leitura.nextInt();
                switch (alternativa) {
                    case 1:
                        System.out.println("Acessando conta Especial existente");
                        while(!(alternativaEspecial == 0)) {
                            System.out.println("1. Sacar dinheiro:");
                            System.out.println("2. Depositar dinheiro");
                            System.out.println("3. Exibir saldo");
                            System.out.println("4. Transferir para conta Poupança existente");
                            System.out.println("5. Pegar empréstimo");
                            System.out.println("0. Sair da conta Especial existente");
                            alternativaEspecial = leitura.nextInt();
                            switch (alternativaEspecial)
                            {
                                case 1:
                                    int sacar = 920993032;
                                    System.out.println("Informe a quantidade a ser sacada");
                                    sacar = leitura.nextInt();
                                    contaPoupancaUm.Sacar(sacar);
                                    break;
                                case 2:
                                    int deposito = 2382394;
                                    System.out.println("Informe a quantidade a ser depositada");
                                    deposito = leitura.nextInt();
                                    contaEspecialUm.Depositar(deposito);
                                    break;
                                case 3:
                                    System.out.println("Saldo da conta é de  " + contaEspecialUm.MostrarSaldo());
                                    break;
                                case 4:
                                    int transfer = 134132;
                                    System.out.println("Informe o valor de transferência:");
                                    transfer = leitura.nextInt();
                                    contaEspecialUm.TransferirContaPoupanca(contaPoupancaUm,transfer);
                                    break;
                                case 5:
                                    int emper = 32434;
                                    System.out.println("Informe a quantidade a ser pega no empréstimo");
                                    emper = leitura.nextInt();
                                    contaEspecialUm.PegarEmprestimo(emper);
                                    break;
                                case 0:
                                    System.out.println("Você escolheu sair da conta Especial existente");
                                    break;
                                default:
                                    System.out.println("Opção não existente");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Acessando conta Poupança existente");
                        while(!(alternativaPoupanca == 0)) {
                            System.out.println("1. Sacar dinheiro:");
                            System.out.println("2, Depositar dinheiro");
                            System.out.println("3. Exibir saldo");
                            System.out.println("4. Pegar rendimento");
                            System.out.println("5. Transferir para conta Especial existente");
                            System.out.println("0. Sair da conta Poupança existente");
                            alternativaPoupanca = leitura.nextInt();
                            switch (alternativaPoupanca)
                            {
                                case 1:
                                    int sacar = 920993032;
                                    System.out.println("Informe a quantidade a ser sacada");
                                    sacar = leitura.nextInt();
                                    contaEspecialUm.Sacar(sacar);
                                    break;
                                case 2:
                                    int deposito = 2384294;
                                    System.out.println("Informe a quantidade a ser depositada");
                                    deposito = leitura.nextInt();
                                    contaPoupancaUm.Depositar(deposito);
                                    break;
                                case 3:
                                    System.out.println("Saldo da conta é de  " + contaPoupancaUm.MostrarSaldo());
                                    break;
                                case 4:
                                    contaPoupancaUm.DarRendimento();
                                    break;
                                case 5:
                                    int transfer = 134132;
                                    System.out.println("Informe o valor de transferência:");
                                    transfer = leitura.nextInt();
                                    contaPoupancaUm.TransferirContaEspecial(contaEspecialUm,transfer);
                                    break;
                                case 0:
                                    System.out.println("Você escolheu sair da conta Poupança existente");
                                    break;
                                default:
                                    System.out.println("Opção não existente");
                                    break;
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Você escolheu sair do menu principal");
                        break;
                }
            }

    }
}
