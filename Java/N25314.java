package backjoon;

import java.util.Scanner;

public class N25314 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Num = scan.nextInt();
        String S = "";
        scan.close();

        for (int i = 1; i <= Num / 4; i++) {
            S += "long ";
        }
        System.out.println(S + "int");
    }
}
