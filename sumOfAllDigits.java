import java.util.Scanner;

public class sumOfAllDigits {
    public static void main(String[] args) {
        System.out.println("Enter the num to check for sum of all its digit.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOfDigits(num);
        sc.close();
    }
    public static void sumOfDigits(int num){
        int temp = num ;
        int sum = 0 ;
        while(num!= 0){ 
            int digit = num%10 ;
            sum += digit ; 
            num = num/10;
        }
        System.out.println("The sum of all digits in " + temp + " is equal to " + sum);
    }
}
