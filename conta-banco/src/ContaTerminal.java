import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // declaração das variaveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência");
        agencia = scanner.next();
        System.out.println("digite o numero da conta");
        numero = scanner.nextInt();
        System.out.println("digite o nome do Cliente");
        nomeCliente = scanner.next();
        System.out.println("digite o saldo da conta");
        saldo = scanner.nextDouble();

        System.out.println("Olá ".concat(nomeCliente)
                + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) + ", conta " + numero
                + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
