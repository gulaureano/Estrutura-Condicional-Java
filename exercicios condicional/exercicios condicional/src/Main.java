import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Exercicio 1
		/*
		int a;
		
		a = sc.nextInt();
		if (a < 0) {
			System.out.println(a + " ? um n?mero negativo");
		}
		else {
			System.out.println(a + " ? um n?mero positivo");
		}
		*/
		
		//Exercicio 2
		/*
		int a;
		int resto;
		
		a = sc.nextInt();
		resto = a%2;
		if (resto == 0) {
			System.out.println(a + " ? um n?mero par");
		}
		else {
			System.out.println(a + " ? um n?mero ?mpar");
		}*/
		
		//Exercicio 3
		/*
		int a;
		int b;
		int multiplos = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a>b) {
			multiplos = a%b;
		}
		else {
			multiplos = b%a;
			
		}
		
		if (multiplos == 0) {
			System.out.println(a + " e "+ b + " s?o n?meros m?ltiplos");
		}
		else {
			System.out.println(a + " e " + b + " n?o s?o n?meros m?ltiplos");
		}
		*/
		
		//Exercicio 4
		/*
		int horaInicial;
		int horaFinal;
		int duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("A dura??o do jogo foi de " + duracao + "horas");
		*/
		
		//Exercicio 5
		
		/*		
		int codigo;
		int quantidade;
		double preco;
		double total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco = 4.0;
			total = preco * quantidade;
			System.out.println("O total ? de: R$" + total);
		}
		else {
			if (codigo == 2) {
				preco = 4.5;
				total = preco * quantidade;
				System.out.println("O total ? de: R$" + total);
			}
			
			if (codigo == 3) {
				preco = 5.0;
				total = preco * quantidade;
				System.out.println("O total ? de: R$" + total);
			}
			
			if (codigo == 4) {
				preco = 2.0;
				total = preco * quantidade;
				System.out.println("O total ? de: R$" + total);
			}
			
			if (codigo == 5) {
				preco = 1.5;
				total = preco * quantidade;
				System.out.println("O total ? de: R$" + total);
			}
			
			else {
				System.out.println("Voc? digitou um c?digo inv?lido");
			}
		}
		*/
		
		//Exercicio 06
		/*
		double valor;
		
		valor = sc.nextDouble();
		
		if (valor >= 0 && valor <= 25.0) {
			System.out.println("Intervalo [0 - 25]");
		}
		else {
			if (valor >= 25.1 && valor <= 50.0) {
				System.out.println("Intervalo [25 - 50]");
			}
			else	if (valor >= 50.1 && valor <= 75.0) {
				System.out.println("Intervalo [50 - 75]");
			}
			else 	if (valor >= 75.1 && valor <= 100.0) {
				System.out.println("Intervalo [75 - 100]");
			}
			else {
				System.out.println("Valor fora do Intervalo");
			}
		}
		*/
		
		//exercicio 7
		/*
		double x;
		double y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x==0 && y==0) {
			System.out.println("Origem");
		}
			else if (x>0 && y>0) {
				System.out.println("Q1");
			}
			
			else if (x>0 && y<0) {
				System.out.println("Q4");
				}
			else if (x<0 && y>0) {
				System.out.println("Q2");
			}
		else {
			System.out.println("Q3");
		}
		*/
		
		
		
		sc.close();

	}

}
