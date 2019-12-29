package schoolsimulation.demo3;

public class Main {//动态规划，8*8，求移动方案总数

    public static void main(String[] args) {
        int m = 8;
        int n = 8;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n) {
        int [][]nums=new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if(i==0) nums[0][j]=1;
                else if(j==0) nums[i][0]=1;
                else nums[i][j]=nums[i-1][j]+nums[i][j-1];
            }
        }
        return nums[m-1][n-1];
    }
}