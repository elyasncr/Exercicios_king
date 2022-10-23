package curso_java_udemy;

import java.util.Scanner;

public class Ex06_king {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, media;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		sc.close();
		
		media = (a+b)/2;
		
		System.out.printf("Média: %.2f%n", media);
		
	}
}
