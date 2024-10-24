import java.util.Scanner;

public class Main {
    private static final int TOTAL = 9;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, index = 0, max = 0;

        for (int i=0;i<TOTAL;i++){
            n = sc.nextInt();
            if (n>max) {
                max = n;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);

    }
}
