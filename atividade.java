package atividade;

import java.util.Scanner;

public class atividade {
	public static void main(String[] args) {
		int codigo = 3, meses;
		double salario, decimo;

		Scanner in = new Scanner(System.in);
		
		while (codigo!=4) {
			System.out
					.println("Informe o que você deseja:\n1 - Novo Salário\n2 - Férias\n3 - Décimo terceiro\n4 - Sair");
			codigo = in.nextInt();

			if (codigo > 0 && codigo < 5) {

				switch (codigo) {
				case 1:
					System.out.print("Informe o seu salário: ");
					salario = in.nextDouble();

					if (salario <= 350) {
						salario += salario * 0.15;
					} else if (salario <= 600) {
						salario += salario * 0.1;
					} else {
						salario += salario * 0.05;
					}

					System.out.println("Seu salário ajustado é de R$ " + salario);
					break;
				case 2:
					System.out.print("Informe o seu salário: ");
					salario = in.nextDouble();
					salario += salario / 3;
					System.out.println("O valor das suas férias é de R$ " + salario);
					break;
				case 3:
					System.out.println("Informe o seu salário: ");
					salario = in.nextDouble();
					System.out.println(
							"Informe quantos meses você está na empresa?(caso seja mais do que um ano insira 12): ");
					meses = in.nextInt();
					decimo = salario * meses / 12;
					System.out.println("Seu décimo terceiro é de R$ " + decimo);
					break;

				}
			} else {
				System.out.println("Código inválido. Favor inserir opção válida.");
			}
		}
		System.out.println("Programa finalizado.");
	}
}
