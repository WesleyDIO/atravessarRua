import java.util.Scanner;
public class Char {
 
	public static void main(String [] args) {
	 Scanner entrada = new Scanner (System.in);
	 
	 double nota;
	 
	 System.out.println("Digite a nota do aluno");
	 nota = entrada.nextDouble();
	 
	 classificarNota(nota);
	 System.out.println("Sua nota é: "+classificarNota(nota));
 }
	public static char classificarNota(double nota) {
		Scanner entrada = new Scanner (System.in);
		char notas;
		if(nota >= 9.0) {
			notas = 'A';
		}
		else if (nota >= 8.0 && nota < 9.0) {
			notas = 'B';
		}
		else if( nota >= 7.0 && nota < 8.0 ) {
			notas = 'C';
		}
		else if(nota >= 6.0 && nota < 7.0) {
			notas = 'D';
		}
		else {
			notas = 'E';
		}
		return notas;
		
	}
}
