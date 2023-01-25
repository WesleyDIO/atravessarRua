import java.util.Scanner;
public class contacorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		
		int opçao;
		double definirSaldoInicial=0.0, sacar=0.0, depositar=0.0;
		
		do {
		System.out.println("Digite o que deseja fazer: \n1(depositar)\n2(sacar)\n3(digitar saldo inicial)\n4(sair)\n>");
		opçao = entrada.nextInt();
		
		if(opçao == 1) {
			depositar(depositar, definirSaldoInicial);
			definirSaldoInicial = depositar(depositar, definirSaldoInicial);
			
		}
		if(opçao == 2) {
			sacar(sacar, definirSaldoInicial);
			if(sacar(sacar, definirSaldoInicial)!=0) {
				System.out.println("Saque efetivado");
				definirSaldoInicial = sacar(sacar, definirSaldoInicial);
			}
		
	    }
		if(opçao == 3) {
			definirSaldoInicial(definirSaldoInicial);
			definirSaldoInicial = definirSaldoInicial(definirSaldoInicial);
		}
        if(opçao == 4) {
        	System.out.println("programa encerrado");
        }
         
         System.out.println("Saldo atual é: "+definirSaldoInicial);
		} while(opçao!=4);
	
	}
	public static double definirSaldoInicial(double definirSaldoInicial) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual é o saldo inicial da sua conta corrente");
		return Double.parseDouble(entrada.nextLine());
	}
	public static double sacar ( double sacar, double definirSaldoInicial ) {
		Scanner entrada = new Scanner(System.in);
		double saca;
		System.out.println("Qual é o valor de deseja sacar?");
		saca = entrada.nextDouble();
		if(verificaSaque(sacar,definirSaldoInicial)==true) {
			sacar = definirSaldoInicial-saca;
			return sacar;
		}else {
			System.out.println("Saldo insuficiente");
			return sacar = 0;
		}
	}
	public static double depositar (double depositar, double definirSaldoInicial) {
		Scanner entrada = new Scanner (System.in);
		double deposita;
		System.out.println("Qual é o valor a ser depositado:");
		deposita = entrada.nextDouble();
		return deposita+definirSaldoInicial;
	}
	public static boolean verificaSaque (double sacar, double definirSaldoInicial) {
		if(sacar <= definirSaldoInicial) {
			return true;
		}else {
			return false;
		}
	}
}
