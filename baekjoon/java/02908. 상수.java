import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        int secondInput = sc.nextInt();
        int firstNum = (firstInput%10)*100 + (firstInput%100/10)*10 + (firstInput/100);
        int secondNum = (secondInput%10)*100 + (secondInput%100/10)*10 + (secondInput/100);
        System.out.println((firstNum > secondNum)? firstNum : secondNum);
    }
}
