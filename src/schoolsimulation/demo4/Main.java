package schoolsimulation.demo4;

public class Main {//在2019个有区别的球中选3个球放在一个盘子里，请问有多少种选法？
    public static void main(String[] args) {
        long m = 2017;
        long n = 2018;
        long b = 2019;
        long result = (m*n*b)/6;
        System.out.println(result);
    }
}