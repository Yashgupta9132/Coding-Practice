import java.util.Scanner;

public class factorialOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the Factorial.");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is : " + factorial(num));
        sc.close();
    }
    public static int factorial(int num){
        if (num == 1){
            return 1 ;
        }else{
            return (num)*factorial(num-1);
        }
    }
}