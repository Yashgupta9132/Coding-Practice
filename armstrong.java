import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number you want to check for Armstrong number.");
        int number = sc.nextInt();
        isArmstrong(number);
        sc.close();
    }
    public static void isArmstrong(int number){
        int temp = number ; 
        int sum = 0 ;
        int length = String.valueOf(number).length();
        while(temp>0){
            int digit = temp%10 ;
            sum += Math.pow(digit , length);
            temp /= 10 ;
        }
        if (sum == number){
            System.out.println(number + " is a Armstrong Number");
        }else {
            System.out.println(number + " is not a Armstrong Number");
        }
    }
}
 