package Aula2006;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int resposta = 0;
		System.out.println("Digite un numero inteiro: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		int num2 = entrada.nextInt();
		System.out.println("Escolha um : + - * /: ");
		char operador = entrada.next().charAt(0); 
		entrada.close();
		
		switch( operador ){
		case '*' : resposta = num1 * num2;
		break;
		case '+' : resposta = num1 + num2;
		break;
		case '-' : resposta = num1 - num2;
		break;
		case '/' : resposta = num1 / num2;
		break;
		default: System.out.println("Comando Inválido");
		}
		
		
		
		
		 if(operador == '*') {
			resposta = num1 * num2;
			
		}
		else if(operador == '/'){
			resposta = num1 / num2;
		}
		else if(operador == '+') {
			resposta = num1 + num2;
			
		}
		else if(operador == '-') {
			resposta = num1 - num2;
		}
		else {
			System.out.println("Comando Inválido");
		}
			System.out.println("O resultado é: " + resposta);
		
		
		/* char letra = 'A';
		String frase = "A galinha pintadinha";
		letra = frase.charAt(2);
		System.out.println(letra);
		System.out.println(frase); */
		
		
	}

}
