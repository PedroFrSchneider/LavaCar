import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Pessoa p = new Pessoa();
            Scanner scan = new Scanner(System.in);

            System.out.print("Digite o seu nome: ");
            p.setNome(scan.nextLine());

            System.out.println("1 - Lavagem Externa" +
                    "\n" + "2 - Polimento" +
                    "\n" + "3 - Lavagem Motor" +
                    "\n" + "4 - Lavagem Completa");
            System.out.print("Digite o servico desejado: (numero entre 1 e 4): ");
            p.setServico(scan.nextInt());
            scan.nextLine();

            double precoServico = 0.0;

            int servicoEscolhido = p.getServico();

            if (servicoEscolhido == 1) {
                    precoServico = 50.0;
            } else if (servicoEscolhido == 2) {
                    precoServico = 200.0;
            } else if (servicoEscolhido == 3) {
                    precoServico = 80.0;
            } else if (servicoEscolhido == 4) {
                    precoServico = 120.0;
            } else {
                    System.out.println("Servico inválido. Por favor, escolha entre 1 e 4.");
            }


            System.out.print("Digite o seu contato (celular ou email): ");
            p.setContato(scan.nextLine());

            System.out.print("\n");
            System.out.print("\n");
            System.out.println("Nome: " + p.getNome());
            System.out.println("Valor do serviço escolhido: R$ " + precoServico);
            System.out.println("Contato: " + p.getContato());
        }
    }