import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int a : arr){
            if (a > max) max = a;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjectNum = sc.nextInt();
        int sum = 0;
        int[] scoreArray = new int[subjectNum];
        for (int i=0; i<subjectNum; i++){
            scoreArray[i] = sc.nextInt();
            sum += scoreArray[i];
        }
        double result = (double)(sum * 100) / (subjectNum * findMax(scoreArray));
        System.out.println(result);
    }
}
