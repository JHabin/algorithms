import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int res = 1;
            if ((s.length() == 1)&&(s.charAt(0) == ' ')) {
                res = 0;
            }
            else {
                for (int i = 1; i < s.length() -1; i++) {
                    if (s.charAt(i) == ' ') res++;
                }
            }
            System.out.println(res);
        }

}
