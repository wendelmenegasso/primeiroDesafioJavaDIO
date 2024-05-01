import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        String agencia = null;
        String nomeCliente = null;
        int numero;
        double saldo;
        String resposta = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia!");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o numero da Conta");
        numero = Integer.parseInt(sc.nextLine());

        System.out.println("Por favor, digite o nome do Cliente");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo");
        saldo = Double.parseDouble(sc.nextLine());

        System.out.println(resposta.concat("Ola ")
                .concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque"));
    }
}
