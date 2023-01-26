package fatura;
import java.util.Scanner;
public class faturateste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner entrada = new Scanner (System.in);
         
         int [] quantidade = new int [5];
         String [] numero = new String [5],  descricao = new String [5];
         double [] preco = new double [5], total = new double [5];
         
         for ( int i = 0; i < 5; i++) {
        	 numero [i] = numero ();
        	 descricao [i] = descricao ();
        	 preco [i] = preco ();
        	 quantidade [i] = quantidade ();
         }
         for(int i=0;i<5;i++) 
         {
             System.out.println("------------------------------------------");
             System.out.println("produto "+(i+1)+"\nNúmero: "+numero[i]+"\nDescrição: "+descricao[i]+"\nQuantidade: "+quantidade[i]+"\nPreco: "+preco[i]);
             System.out.println("------------------------------------------");
         }
         for(int i=0;i<5;i++) 
         {
             total[l]=preco[l]*quantidade[l];
             System.out.println("----------------Faturamento---------------");
             System.out.println("Produto "+(i+1)+"\nNúmero: "+numero[i]+" Descrição: "+descricao[i]+" Quantidade "+quantidade[i]+" Preço: "+preco[i]+"\nTOTAL "+total[i]);
             System.out.println("------------------------------------------");
         }
         
	}
	public static String numero () {
		Scanner entrada = new Scanner (System.in);
		String numero;
		System.out.println("Digite o número do produto: ");
		numero = entrada.next();
		return numero ;
		
	}
	public static String descricao () {
		Scanner entrada = new Scanner (System.in);
		String descricao;
		System.out.println("Digite a descrição do produto");
		descricao = entrada.next();
		return descricao ;
	}
	public static int quantidade () {
		Scanner entrada = new Scanner (System.in);
		int quantidade;
		System.out.println("Digite a quantidade no estoque");
		quantidade = entrada.nextInt();
		return quantidade ;
	}
	public static double preco () {
		Scanner entrada = new Scanner (System.in);
		double preco;
		System.out.println("Digite o preco de cada produto");
		preco= entrada.nextDouble();
		return preco ;
	}
 
}
