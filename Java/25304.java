package backjoon;

import java.util.Scanner;

public class N25304 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();  // 영수증에 적힌  물건의 총 금액 
        int N = scan.nextInt();  // 물건의 종류 수 
        	int T = 0;
        	
        	for(int i = 0; i < N; i++){
        		int a = scan.nextInt();
        		int b = scan.nextInt();

        		T += a * b;
        		
        	}if(T == X ) {
        		System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }
}
