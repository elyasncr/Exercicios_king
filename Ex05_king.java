package curso_java_udemy;

import java.util.Scanner;

public class Ex05_king {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		soma = a + b;
		
		System.out.println("SOMA: " + soma);

	}

}
