package backjoon;

import java.util.Scanner;

public class N2439 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in); //찍을  갯수 
	int N;
	N = s.nextInt();	
	
	for(int i = 1; i <= N; i ++) {  
		for(int o =1; o <= i; o ++) {  
		System.out.print( "*");
		}
		System.out.println();
		}
	}
}
