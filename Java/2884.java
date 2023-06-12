package backjoon;
import java.util.Scanner;

public class N2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int decomposition = H * 60 + M;
        //24시간을 분으로 쪼개면 1440
        int assembly = (decomposition - 45 + 1440) % 1440;

        int assemblyH = assembly / 60;
        int assemblyM = assembly % 60;

        System.out.println(assemblyH + " " + assemblyM);

        sc.close();
    }
}
