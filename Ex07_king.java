package curso_java_udemy;

import java.util.Scanner;

public class Ex07_king {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		double quociente, resto;
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		quociente = a / b;
		resto = a % b;
		
		System.out.println("Quociente: " + quociente);
		System.out.println("Resto: " + resto);
		
		
		
		
		

	}

}
