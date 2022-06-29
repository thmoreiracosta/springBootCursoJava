package application;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.Account;

public class Program {
	/*
	 * Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o
	 * n�mero da conta, o nome do titular da conta, e o valor de dep�sito inicial
	 * que o titular depositou ao abrir a conta. Este valor de dep�sito inicial,
	 * entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar
	 * no momento de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo
	 * inicial da conta ser�, naturalmente, zero. Importante: uma vez que uma conta
	 * banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J� o nome
	 * do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o
	 * de casamento, por exemplo). Por fim, o saldo da conta n�o pode ser alterado
	 * livremente. � preciso haver um mecanismo para proteger isso. O saldo s�
	 * aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada
	 * saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar
	 * com saldo negativo se o saldo n�o for suficiente para realizar o saque e/ou
	 * pagar a taxa. Voc� deve fazer um programa que realize o cadastro de uma
	 * conta, dando op��o para que seja ou n�o informado o valor de dep�sito
	 * inicial. Em seguida, realizar um dep�sito e depois um saque, sempre mostrando
	 * os dados da conta ap�s cada opera��o.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		Random random = new Random();

		System.out.println("Hello, welcome to our bank. It is a pleasure to have you here with us. "
				+ "Let's start creating your bank account. "
				+ "Write down your account number and then enter your personal details.");
		int number = random.nextInt(9999);
		System.out.println("Bank Account number: " + number);
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		// REALIZANDO DEP�SITO
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);

		// REALIZANDO SAQUE
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);

		sc.close();

	}

}
