import java.util.Scanner;
public class Paridad {
	public static void main(String[]args){
		int num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca un numero y presione enter");
		num= s.nextInt();
		
		if(num%2==0)
			System.out.println("El numero es Par");
		else
			System.out.println("El numero es Impar");
	}
}
		