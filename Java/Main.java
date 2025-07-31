package backjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for(int Y = 1; Y < 10; Y++  ) {
			System.out.println(N + "*" +  Y +"= " +(N*Y));
		}
	}
}
