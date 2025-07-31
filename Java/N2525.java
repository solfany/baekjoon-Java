package backjoon;

import java.util.Scanner;

public class N2525 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int food = sc.nextInt();
        
        int Time = ( H * 60 + M);
        int makeFood = (Time + food ); 
        
        int makeTime = ( makeFood  % 1440);
        
        int makeTimeFoodH = makeTime / 60;
        int makeTimeFoodM = makeTime % 60;

        System.out.println(makeTimeFoodH + " " +makeTimeFoodM);

        sc.close();
	}
}
