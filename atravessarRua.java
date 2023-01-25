"# atravessarRua" 

  package procedimentos;
import java.util.Scanner;
public class procedimentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner entrada = new Scanner (System.in);
		
		int x,y,d;
		
		System.out.println("Qual será o ponto inicial da sua partida?");
		x = entrada.nextInt();
		
		System.out.println("A distancia que cada passo percorreu?");
		d = entrada.nextInt();
		
		System.out.println("Digite a distancia a ser percorrida ");
		y = entrada.nextInt();
		
		atravessando(x,y,d);
	}
	
	public static void atravessando(int x, int y, int d) {
		int contadorAndar = 0;
		while(x < y) {
			contadorAndar++;
			x += d;
		}
		if(x >= y) {
			System.out.println("A quantidade de passos dados foi de "+contadorAndar);
		}
	}

}
