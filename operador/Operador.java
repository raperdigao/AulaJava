package operador;

public class Operador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s1 = "Alô";
		String s2 = "Tchau";
		String resposta = s1.equals(s2) ? "Sim" : "Não";
		
		
		
		int i1 = 2;
		int i2 = 7;
			
		
		int i3 = (i1 != i2) ? 8 : 9;
		
		if (i1 != i2 ) {
			i3 = 8;
		}else {
			i3 = 9;
			
		}
		

		
		System.out.println(resposta);
		System.out.println(i3);
		
		
	}

}
