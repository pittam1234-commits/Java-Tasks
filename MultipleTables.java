import java.util.Scanner;
public class MultipleTables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println10
            ("Table of :"+i);
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + "="+(i*j));
            }
        }
    }
}