import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max, min;
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        min = max = arr[0];
        for (int i=1;i<n;i++){
            arr[i] = sc.nextInt();
            if (arr[i] < min) min = arr[i];
            else if (arr[i] > max) max = arr[i];
        }
        System.out.println(min+" "+max);
    }
}
