import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        double res = (double)n1/n2;
        System.out.println(res);
    }
}