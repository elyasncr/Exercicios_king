package curso_java_udemy;

import java.util.Scanner;

public class Ex04_king {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double c, l, p, custo, preco;
		preco = 15.3;
		
		
		c = sc.nextDouble();
		l = sc.nextDouble();
		p = sc.nextDouble();
		sc.close();
		
		
		custo = c*l*p + 15.3;
		
		System.out.println(custo);
		

	}

}
