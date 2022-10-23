package curso_java_udemy;

import java.util.Scanner;

public class Ex01_king {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma, diferenca;
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		soma = a + b;
		diferenca = a - b;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A diferença é: " + diferenca);
		
		

	}

}
