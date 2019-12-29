package schoolsimulation.demo9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int xy[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                xy[i][j] = cin.nextInt();
            }
        }
        int minWeight = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            minWeight = Math.min(minWeight,getResult(i,n,m,xy));
        }
        System.out.println(minWeight);
        //单个测试
//        int result = getResult(2,n,m,xy);
//        System.out.println(result);
    }
    public static int getResult(int index, int n, int m, int xy[][]) {
        int former = 0;
        int later = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= index; j++) {
                former += xy[i][j];
            }
            for (int j = index+1; j < m; j++) {
                later += xy[i][j];
            }
        }
        return later > former ? (later-former) : (former-later);
    }
}