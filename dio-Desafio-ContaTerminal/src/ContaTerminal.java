import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta  = 0;
        String agencia = "";
        String nomeCliente  = "";
        double saldo  = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("XXXXXXXXXX PROGRAMA BANCARIO XXXXXXXXXX");

        System.out.println("Favor, informe seu Nome !");
        nomeCliente = scan.nextLine();

        System.out.println("Olá " + nomeCliente + ", digite o número da Agência !");
        agencia = scan.nextLine();
        
        System.out.println("Agora, digite o número da Conta !");
        numeroConta = scan.nextInt();

        System.out.println("Para finalizar, informe seu Saldo atual !");
        saldo = scan.nextDouble();


        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numeroConta+ " e seu saldo " +saldo+ " já está disponível para saque");

        scan.close();

    }
}
