package opensource.conta;

import java.util.Scanner;

/**
 * <h1>DESAFIO DIO - Trilha Java Básico</h1>
 * <p>Este código é um desafio proposto pela DIO com a intenção de aplicar todo o conhecimento adquirido no aprendizado de sintaxe Java</p>
 * <h2>Proposta do Desafio</h2>
 * <p>Desenvolver uma simples conta bancária que será executada no terminal e permitirá a interação entre máquina e usuário.</p>
 * 
 * @author Miguel Barbosa
 * @version 1.0
 * @since 20/05/2024
 * */

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		// TODO: O usuário terá que inserir seu nome, número da agência, número da conta e seu saldo atual
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seja muito bem-vindo! Qual é o seu nome?");
		String nomeCliente = scanner.next();
		
		System.out.println("Qual o número da agência?");
		String agencia = scanner.next();
		
		System.out.println("Qual o número de 4 dígitos da sua conta bancária?");
		int contaBancaria = scanner.nextInt();
		
		System.out.println("Qual seu saldo atual?");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + 		agencia + ", conta " + contaBancaria + " e seu saldo " + saldo + " já está disponível para saque!");
		
		
		
	}

}
