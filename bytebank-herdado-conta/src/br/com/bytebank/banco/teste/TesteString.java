package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
	
		String vazio = " Alura ";
		
		String outroVazio = vazio.trim();
		System.out.println(outroVazio);
		System.out.println(vazio.contains("Alu"));
		
		String nome = "Alura"; //object literal
//		String outroa = new String("Alura"); m� pratica
	
	
//		String sub = nome.substring(1);
//		System.out.println(sub);
	
		
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
	
		
		
		
		
		
		//int pos = nome.indexOf("ur");
		//System.out.println(pos);
		
		
		
		
		
//       char c = nome.charAt(0);
//       System.out.println(c);
		
		
//		char c = 'A';
//		char d = 'a';l
//		 String outra = nome.replace(c , d); 
//		
		
	    //String outra = nome.toUpperCase();
		
		//System.out.println(nome);
		//System.out.println(outra);
		
		String nome1 = "Mario";
		nome1 = nome1.replace('o', 'a');
		System.out.println(nome1);
	}

}
