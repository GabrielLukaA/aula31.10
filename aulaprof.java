package atividade;
import java.util.Random;
import java.util.Scanner;

public class aulaprof {

	public static void main(String[]args) {
		int codigo, codigoPc, vitoriasCpu=0, vitoriasPlayer1=0;
		
		Scanner in = new Scanner(System.in);
		Random numero = new Random ();
		
		System.out.println("MD3 no pedra papel tesoura");
		
		while (vitoriasCpu<2 && vitoriasPlayer1<2) {
		
		System.out.println("Qual a sua escolha?\n0 - Pedra\n1 - Papel\n2 - Tesoura");
		codigo = in.nextInt();
		codigoPc = numero.nextInt(3);
		switch (codigo){
			case 0:
				if (codigoPc==0) {
					System.out.println("Player 1: Pedra\nCPU: Pedra\nPedra X Pedra é empate.");
				} else if (codigoPc==1) {
					System.out.println("Player 1: Pedra\nCPU: Papel\nPedra X Papel é vitória da CPU.");
					vitoriasCpu++;
				} else if (codigoPc==2) {
					System.out.println("Player 1: Pedra\nCPU: Tesoura\nPedra X Tesoura é vitória do Player 1.");
					vitoriasPlayer1++;
				}
				break;
			case 1:
				if (codigoPc==0) {
					System.out.println("Player 1: Papel\nCPU: Pedra\nPapel X Pedra é vitória do Player 1.");
					vitoriasPlayer1++;
				} else if (codigoPc==1) {
					System.out.println("Player 1: Papel\nCPU: Papel\nPapel X Papel é empate.");
				} else if (codigoPc==2) {
					System.out.println("Player 1: Papel\nCPU: Tesoura\nPapel X Tesoura é vitória da CPU.");
					vitoriasCpu++;
				}
				break;
			case 2:
				if (codigoPc==0) {
					System.out.println("Player 1: Tesoura\nCPU: Pedra\nTesoura X Pedra é vitória da CPU.");
					vitoriasCpu++;
				} else if (codigoPc==1) {
					System.out.println("Player 1: Tesoura\nCPU: Papel\nTesoura X Papel é vitória do Player 1.");
					vitoriasPlayer1++;
				} else if (codigoPc==2) {
					System.out.println("Player 1: Tesoura\nCPU: Tesoura\nTesoura X Tesoura é empate.");
				}
				break;
			
		}
		}
		if (vitoriasCpu>vitoriasPlayer1) {
			System.out.println("A CPU saiu vitoriosa, você perdeu!");
		} else if (vitoriasPlayer1>vitoriasCpu) {
			System.out.println("Você se  saiu vitorioso, parabéns!!!!");
		}
		
		
	}
}
