package schoolsimulation.demo6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(isTrue(i))
                count++;
        }
        System.out.println(count);
    }
    public static boolean isTrue(int m) {
        String str = m + "";
        if (str.indexOf('2') == -1) return true;
        else return false;
    }
}