import java.util.Scanner;

public class harshadNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check for Harshad number : ");
        int num = sc.nextInt();
        sc.close();
        isHarshadNumber(num);
    }
    public static void isHarshadNumber(int num){
        int temp = num ; 
        int length = String.valueOf(temp).length();
        int sumOfDigits = 0;
        while(temp!=0){
            int digit = temp%10 ;
            sumOfDigits += digit ;
            temp /= 10 ;
            length--;
        }
        if (num % sumOfDigits == 0){
            System.out.println(num + " is a Harshad Number");
        }else{
            System.out.println(num + " is not a Harshad Number");
        }
    }
}