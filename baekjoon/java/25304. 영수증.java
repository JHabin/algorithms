import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ptotal = sc.nextInt();
        int ntotal = sc.nextInt();
        int res = 0;
        for (int i=0;i<ntotal;i++){
            int price = sc.nextInt();
            int n = sc.nextInt();
            res += price*n;
        }
        if (ptotal == res) System.out.println("Yes");
        else System.out.println("No");
    }
}
