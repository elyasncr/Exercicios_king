package curso_java_udemy;

import java.util.Scanner;

public class Ex03_king {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, expressao;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		sc.close();
		
		expressao = 3*a + 2*b + 5;
		
		System.out.printf("A expressão 3a + 2b + 5 =  %.2f%n", expressao);
		
	}

}
