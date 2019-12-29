package schoolsimulation.demo5;

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
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) >= str.charAt(i-1)) continue;
            else return false;
        }
        return true;
    }
}