package switchcase;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

			int opcao;
			String nome;
			float salario;
			System.out.print("""
					 ___________________________________________________________
					|  Códidigo do Cargo     Cargo       Percentual do Reajuste |
					|-----------------------------------------------------------|
					|          1        | Gerente       |          10%          |
					|          2        | Vendedor      |           7%          |
					|          3        | Supervisor    |           9%          |
					|          4        | Motorista     |           6%          |
					|          5        | Estoquista    |           5%          |
					|          6        | Técnico de TI |           8%          |
					|___________________________________________________________|

					Nome do colabrador: """);
			nome = sc.nextLine();
			System.out.print("Cargo: ");
			opcao = sc.nextInt();
			System.out.print("Salário: ");
			salario = sc.nextFloat();

			switch (opcao) {
			case 1 -> System.out.printf("""
					Nome do colaborador: %s

					Cargo: Gerente

					Salário: R$ %.2f
					""", nome, (salario * 1.10));
			case 2 -> System.out.printf("""

					Nome do colaborador: %s

					Cargo: Vendedor

					Salário: R$ %.2f
					""", nome, (salario * 1.07));
			case 3 -> System.out.printf("""

					Nome do colaborador: %s

					Cargo: Supervisor

					Salário: %.2f
					""", nome, (salario * 1.09));
			case 4 -> System.out.printf("""

					Nome do colaborador: %s

					Cargo: Motorista

					Salário: R$ %.2f
					""", nome, (salario * 1.06));
			case 5 -> System.out.printf("""

					Nome do colaborador: %s

					Cargo: Estoquista

					Salário:  R$ %.2f
					""", nome, (salario * 1.05));
			case 6 -> System.out.printf("""

					Nome do colaborador: %s

					Cargo: Técnico de TI

					Salário: R$ %.2f
					""", nome, (salario * 1.08));
			default -> System.out.println("Opção inválida!");
			}

		sc.close();

	}

	public static void menuLanchonete(Scanner sc) {
		int opcao, quantidade;
		double valorTotal = 0;

		System.out.print("""
				 ___________________________________________________
				| Código do Produto     Produto     Preço Unitário  |
				|___________________________________________________|
				|         1        | Cachorro Quente | R$ 10.00     |
				|         2        | X-Salada        | R$ 15.00     |
				|         3        | X-Bacon         | R$ 18.00     |
				|         4        | Bauru           | RS 12.00     |
				|         5        | Refrigerante    | R$  8.00     |
				|         6        | Suco de Laranja | R$ 13.00     |
				-----------------------------------------------------
				 Código do produto:""");
		opcao = sc.nextInt();
		System.out.print("Quantidade: ");
		quantidade = sc.nextInt();

		switch (opcao) {
		case 1 ->
			System.out.println("Produto: Cachorro Quente\nValor Total R$ " + String.format("%.2f", 10.00 * quantidade));
		case 2 -> System.out.println("Produto: X-Salada\nValor Total R$ " + String.format("%.2f", 15.00 * quantidade));
		case 3 -> System.out.println("Produto: X-Bacon\nValor Total R$ " + String.format("%.2f", 18.00 * quantidade));
		case 4 -> System.out.println("Produto: Bauru\nValor Total R$ " + String.format("%.2f", 12.00 * quantidade));
		case 5 ->
			System.out.println("Produto: Refrigerante\nValor Total R$ " + String.format("%.2f", 8.00 * quantidade));
		case 6 ->
			System.out.println("Produto: Suco de Laranja\nValor Total R$ " + String.format("%.2f", 13.00 * quantidade));
		default -> System.out.println("Opção invalida");
		}

	}

	

	public static void calculadoraSimples(Scanner sc) {
		int opcao;
		float n1, n2;
		System.out.print("""
				 ___________________________________________________________
				|       Códidigo                  Operação                  |
				|-----------------------------------------------------------|
				|          1        | Soma                                  |
				|          2        | Subtração                             |
				|          3        | Multiplicação                         |
				|          4        | Divisão                               |
				|___________________________________________________________|

				Digite o 1° número: """);
		n1 = sc.nextFloat();
		System.out.print("Digite o 2° número: ");
		n2 = sc.nextFloat();

		System.out.print("Operação: ");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1 -> System.out.println(n1 + " + " + n2 + " = " + String.format("%.1f", n1 + n2));
		case 2 -> System.out.println(n1 + " - " + n2 + " = " + String.format("%.1f", n1 - n2));
		case 3 -> System.out.println(n1 + " * " + n2 + " = " + String.format("%.1f", n1 * n2));
		case 4 -> System.out.println(n1 + " / " + n2 + " = " + String.format("%.1f", n1 / n2));
		default -> System.out.println("Opção inválida!");
		}
	}

	public static void saqueDepositoESaldo(Scanner sc) {
		int opcao;
		float saldo = 1000.00f,saque = 0f, newSaldo = 0f, deposito;

		System.out.print("""
			     ___________________________________________________________
			    | Códidigo da Operação            Operação                  |
			    |-----------------------------------------------------------|
			    |          1        | Saldo                                 |
			    |          2        | Saque                                 |
			    |          3        | Depósito                              |
			    |___________________________________________________________|

				Operação:  """);
			opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Operação - Saldo \n\nSaldo: R$ " + String.format("%.2f", saldo));
			break;
		case 2:
			System.out.print("Valor: ");
			saque = sc.nextFloat();
			if (saldo > saque) {
				newSaldo = saldo - saque;
				System.out.println("Operação - Saldo \n\nSaldo: R$ " + String.format("%.2f", newSaldo ));
			} else {
				System.out.println("Saldo Insuficiente!");
			}
			break;
		case 3:
			System.out.print("Valor: ");
			deposito = sc.nextFloat();
			System.out.println("Operação - Depósito \n\nSaldo: R$ " + String.format("%.2f", newSaldo = deposito + saldo));
			break;
		default:
			System.out.println("Opção inválida!");
		}

	}

}
