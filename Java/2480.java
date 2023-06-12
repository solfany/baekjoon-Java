import java.util.Scanner;

public class N2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        int money;

        if (N1 == N2 && N2 == N3) {
            money = 10000 + N1 * 1000;
        } else if (N1 != N2 && N2 != N3 && N1 != N3) {
            money = Math.max(N1, Math.max(N2, N3)) * 100;
        } else if (N1 == N2 && N1 != N3) {
            money = 1000 + N1 * 100;
        } else if (N2 == N3 && N1 != N3) {
            money = 1000 + N2 * 100;
        } else {
            money = 1000 + N3 * 100;
        }
        
        System.out.println(money);
        sc.close();
    }
}
