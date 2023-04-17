package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		String primeiro, segundo, terceiro;

    /*		System.out.println("""
				                       ____| Carnivoro | ---| Aguia |
				                      |    
				             ___ Ave <
				            |         |
				            |         |___| Onivoro |  ---- | Pomba |
				            |
				Vertebrado <               ____| Onivoro | ---- | Homem |
				            |             |
				            |             |
				            |__ Mamifero <
				                          |
				                          |___| Herbivoro | ---- | Vaca |

				                                  ____| Hematófago | --- | Pulga |
					                             |
				                                 |
				                _____| Inseto | <
				               |                 |
				               |                 |____| Herbivoro | ---- | Lagarta |
				Invertebrados <
				               |                    _________| Hematófago | --- | Sanguessuga |
				               |                   |
				               |                   |
				               |_____| Anelideo | <
				                                   |
				                                   |________| Onivoro | ---- | Minhoca |

				""");

		primeiro = sc.nextLine().toLowerCase();
		segundo = sc.nextLine().toLowerCase();
		terceiro = sc.nextLine().toLowerCase();

		if (primeiro.equalsIgnoreCase("Vertebrado")) {
			if (segundo.equalsIgnoreCase("Ave")) {
				if (terceiro.equalsIgnoreCase("Carnivoro")) {
					System.out.println("Aguia");
				} else {
					System.out.println("Pomba");
				}

			} else if (segundo.equalsIgnoreCase("Mamifero")) {
				if (terceiro.equalsIgnoreCase("Onivoro")) {
					System.out.println("Homem");
				}else {
					System.out.println("Vaca");
				}
			}

		} else if (primeiro.equalsIgnoreCase("Invertebrados")) {
			if(segundo.equalsIgnoreCase("Inseto")) {
				if(terceiro.equalsIgnoreCase("Hematofago")) {
					System.out.println("Pulga");
				}else {
					System.out.println("Lagarta");
				}
			}else if(segundo.equalsIgnoreCase("Anelideo")) {
				if(terceiro.equalsIgnoreCase("Hematofago")) {
					System.out.println("Sanguessuga");
				}else {
					System.out.println("Minhoca");
				}
			}
		}
		*/

		valoresInteirosAMaisBMenorOuIgualC(sc);
		sc.close();

	}

	public static void valoresInteirosAMaisBMenorOuIgualC(Scanner sc) {

		int[] vec = new int[3];
		int sum = 0;

		for (int i = 0; i < vec.length; i++) {
			String palavra;
			if (i == 0) {
				palavra = "A";
			} else if (i == 1) {
				palavra = "B";
			} else {
				palavra = "C";
			}

			System.out.print("Digite o valor " + palavra + ": ");
			vec[i] = sc.nextInt();
		}

		sum = vec[0] + vec[1];

		String result = ( sum > vec[2] ) ? "\nSoma de A + B é maior do que C" : (sum < vec[2])? "\nSoma de A + B é menor do que C" : "\nSoma de A + B é igual C" ;

		/*if (sum > vec[2]) {
			System.out.println(
					vec[0] + " + " + vec[1] + " = " + sum + " > " + vec[2] + ");
		} else if () {
			System.out.println(
					vec[0] + " + " + vec[1] + " = " + sum + " < " + vec[2] + "");
		} else {
			System.out.println(vec[0] + " + " + vec[1] + " = " + sum + " == " + vec[2] + "\nSoma de A + B é igual C");
		}*/
		System.out.println(result);
	}

	public static void parEimparPositivoOuNegativo(Scanner sc) {
		int num;
		System.out.print("Digite um número: ");
		num = sc.nextInt();

		if (num % 2 == 0 && num >= 0) {
			System.out.println("O Número " + num + " é par e positivo");
		} else if (num % 2 == 0 && num > 0) {
			System.out.println("O Número " + num + " é par e negativo");
		} else if (num % 2 == 1 && num > 0) {
			System.out.println("O Número " + num + " é impar e positivo");
		} else {
			System.out.println("O Número " + num + " é impar e negativo");
		}
	}

	public static void doacaoDeSangue(Scanner sc) {
		String nomeDoador, trueOrFalse;
		int idade;
		boolean primeiraVez;

		System.out.print("Digite o nome do doador: ");
		nomeDoador = sc.nextLine();

		System.out.print("Digite a idade do doador: ");
		idade = sc.nextInt();
		sc.nextLine();

		System.out.print("Primeira doação de sangue? ");
		primeiraVez = sc.nextBoolean();

		if (idade >= 18 && idade <= 69) {

			if (idade >= 60 && idade <= 69 && primeiraVez == true) {
				System.out.println(nomeDoador + " Não está apto(a) para doar sangue!");
			} else if (primeiraVez) {
				System.out.println(nomeDoador + " está apto(a) para doar sangue!");
			} else {
				System.out.println(nomeDoador + " está apto(a) para doar sangue!");
			}

		} else {
			System.out.println(nomeDoador + " Não está apto(a) para doar sangue!");
		}

	}

}
