package curso_java_udemy;

import java.util.Scanner;

public class Ex02_King {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, soma;
		
		a = sc.nextInt();
		sc.close();
		
		soma = ((3*a)+1) + ((2*a)-1);
		
		System.out.println(soma);

	}

}
