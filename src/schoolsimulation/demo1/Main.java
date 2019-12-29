package schoolsimulation.demo1;
//最大公约数
public class Main {
    public static void main(String[] args) {
        int m = 70044;
        int n= 113148;
        System.out.println(getResult(m, n));
    }
    public static int getResult(int m, int n) {
        int temp = 0;
        while (n!=0) {
            temp = n;

            n = m % n;

            m = temp;

        }
        return m;
    }
}