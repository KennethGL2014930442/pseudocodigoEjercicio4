import java.util.*;

public class ejercicio4{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int contadormayor = 0;
		int contadormenor = 0;
		int i = 1;
		int muestra = 20;
		
		while (i<=muestra){
			int numero = (int)(Math.random()*90+1);
			System.out.println("La edad persona es: "+numero);
			
			if (i==1){
				contadormayor = numero;
				contadormenor = numero;
			}else
				if(numero>contadormayor){
					contadormayor = numero;
				}
				if(numero<contadormenor){
					contadormenor = numero;
				}
				i = i+1;
		}
		System.out.println("La persona de mayor edad es: "+contadormayor);
		System.out.println("La persona de menor edad es: "+contadormenor);
	}
}