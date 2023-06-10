package backjoon;

import java.util.Scanner;

public class N10430 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println ((A*B)%C);
		System.out.println (((A%C) * (B%C))%C);
        
        sc.close();
    }
}


//  선언과 동시에 값을 입력받고 
// 출력문에서 연산과 동시에 값을 나타내도록 했다.

