import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static final int TOTAL = 30;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n;
        for (int i=0;i<TOTAL;i++){
            list.add(i+1);
        }
        for (int j=0;j<TOTAL-2;j++){
            n = sc.nextInt();
            if (list.contains(n)) list.remove(Integer.valueOf(n));
        }
        for (int l : list){
            System.out.println(l);
        }
    }
}
