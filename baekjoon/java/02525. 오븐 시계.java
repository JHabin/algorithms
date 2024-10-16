import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int dur = sc.nextInt();
        m = m+dur;
        while (m>=60) {
            if (h == 23) h = 0;
            else h++;
            m = m - 60;
        }
        System.out.println(h + " " + m);
        sc.close();
    }

}
