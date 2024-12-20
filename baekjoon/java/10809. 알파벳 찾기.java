import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int[] alphabet = new int[26];
            Arrays.fill(alphabet ,-1 );
            for (int i = 0; i < str.length(); i++) {
                int index = Integer.valueOf(str.charAt(i))-97;
                if (alphabet[index] == -1) {
                    alphabet[index] = i;
                }
                else {
                    continue;
                }
            }
            for (int a : alphabet) {
                System.out.print(a + " ");
            }
        }

}
