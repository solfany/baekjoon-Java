package backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> resultList = new ArrayList<>();

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            resultList.add(a + b);
        }
        for (int sum : resultList) {
            System.out.println(sum);
        }
        sc.close();
    }
}