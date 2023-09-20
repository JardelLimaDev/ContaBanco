package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		Scanner agencia = new Scanner(System.in);
		Scanner nome = new Scanner(System.in);
		
		int numeroConta;
		String agenciaBancaria;
		String nomeCliente;
		float saldoConta = 237.48f;
		
		System.out.println("Infome seu nome.");
		nomeCliente = nome.next();
		
		System.out.println("Por favor, digite o numero da conta.");
		numeroConta = numero.nextInt();
		
		System.out.println("Agora digite o numero da agência.");
		agenciaBancaria = agencia.next();
		
		System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, \n"
				+ "sua agência é " + agenciaBancaria + ", conta " +  numeroConta + " e seu saldo R$ " + saldoConta + " \n"
				+ "já está disponível para saque");
		
	}
}
