package schoolsimulation.demo8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int xy[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                xy[i][j] = cin.nextInt();
            }
        }
        long count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1;j < n; j++) {
                if(isTrue(i,j,xy))
                    count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isTrue(int i, int j,int [][]xy) {
        if (xy[i][0]+xy[j][0] == xy[i][1]+xy[j][1]) return true;
        else return false;
    }
}