import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = 0;
        if ((a == b)&&(a==c)) res = 10000+a*1000;
        else if ((a==b)||(a==c)) res = 1000 + a*100;
        else if (b==c) res = 1000 + b*100;
        else res = Math.max(Math.max(a,b),c)*100;

        System.out.println(res);
        sc.close();
    }

}
