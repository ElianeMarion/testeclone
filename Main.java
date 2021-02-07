import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int a,b,c,resultado;
	System.out.println("Digite um valor inteiro");
	a = sc.nextInt();
	System.out.println("Digite um valor inteiro");
	b = sc.nextInt();
	System.out.println("Digite um valor inteiro");
	c = sc.nextInt();
	resultado = verifica(a,b,c);
	mostra(resultado);
	
	sc.close();
	}
    public static int verifica (int x, int y,int z) {
    	int p;
    	if(x>y && x>z) {
    	  p = x;	
    	}else if(y>x && y>z){
    	  p = y;	
    	}else {
    	  p = z;	
    	}
    return p;
    }     
    public static void mostra(int alto) {
    	System.out.print("Maior numero é "+alto);
    }
}  
