package Aula2006;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota = 99;
		int faltas = 0;
		boolean sumaCumLaude = nota >= 88;
		if((nota >= 88) && (faltas == 0)) {
			System.out.println("Você se classificou para bolsa de estudos");
		}
		else {
			System.out.println("Tente Novamente");
		}
	}

}


