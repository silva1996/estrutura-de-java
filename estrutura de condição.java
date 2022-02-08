import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double temperatura = 0;
	
	System.out.println("informe a temperatura do cliente");
	temperatura = scan.nextDouble();
	
	System.out.println("A temperatura do cliente é : "+ temperatura);  
	    
	    //condicional composto
	    if (temperatura > 37){
	        System.out.println("o cliente não pode entrar no estabelecimento");
	    }else {
	    System.out.println("pode entrar parceiro");
	}
	} 
}
	
	
