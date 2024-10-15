import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String res;
        if (score >= 90) res = "A";
        else if (score >= 80) res = "B";
        else if (score >= 70) res = "C";
        else if (score >= 60) res = "D";
        else res = "F";

        System.out.println(res);
    }
}
