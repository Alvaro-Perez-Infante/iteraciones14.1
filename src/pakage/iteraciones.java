package pakage;

import java.util.Scanner;

public class iteraciones {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		final int N = 4;
		
		
		for (int f=1; f<=N; f++) {
			for (int a=1; a<= f; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
}
}
