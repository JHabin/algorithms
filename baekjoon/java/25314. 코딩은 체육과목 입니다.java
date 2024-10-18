import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbyte = sc.nextInt();
        String btype = "long";

        for (int i=0;i<nbyte/4;i++){
            System.out.print(btype+" ");
        }
        System.out.println("int");
    }
}
