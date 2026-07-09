import java.util.Scanner;6
public class LCM {
    public static int Lcm(int a, int b){
        int max = (a > b) ? a:b;
        while(true){
            if(max % a == 0 && max % b == 0){
                return max;
            }
            max++;
        }
    }public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the Num2");
        int num2 = sc.nextInt();
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + Lcm(num1, num2));
    }
}