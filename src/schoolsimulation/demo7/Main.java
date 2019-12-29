package schoolsimulation.demo7;

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
        if(m <= 10) return true;
        String str = m + "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.charAt(0));
        for(int i = 1; i < str.length(); i++) {
            if (stringBuilder.toString().indexOf(str.charAt(i)) != -1)
                return false;
            stringBuilder.append(str.charAt(i));
        }
        return true;
    }
}