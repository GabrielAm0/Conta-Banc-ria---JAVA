import java.util.Scanner;

public class ContraTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 5000;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o numero da sua conta: ");
        numeroConta = scanner.nextInt();
        
        System.out.println("Digite o numero da sua agencia: ");
        agencia = scanner.next();
        
        
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco,  sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está dispoível para saque." );
    }
}
