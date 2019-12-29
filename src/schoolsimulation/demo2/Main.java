package schoolsimulation.demo2;

public class Main {//互质(公约数只有1的两个数)
    public static void main(String[] args) {
        int m = 19000;
        int count = 0;
        for(int i = 0; i < m; i++) {
            if(isZhi(m,i))
                count++;
        }
        System.out.println(count);
    }
    public static boolean isZhi(int m, int i) {
        int temp = 0;
        while (i!=0) {
            temp = i;
            i = m % i;
            m = temp;
        }
        if(m == 1) return true;
        else return false;
    }
}