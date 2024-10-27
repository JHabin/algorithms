import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> inputSet = new HashSet<>();
        int n;
        for (int i = 0; i < 10; i++){
            n = sc.nextInt();
            inputSet.add(n%42);
        }

        System.out.println(inputSet.size());

    }
}
