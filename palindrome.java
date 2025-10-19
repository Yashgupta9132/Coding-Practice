import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check for palindrome.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        isPalindrome(number);
        sc.close();
    }
    public static void isPalindrome(int num){
        int temp = num; 
        int reverse = 0 ; 
        int length = String.valueOf(num).length();
        while(length!=0){
            int digit =  num%10 ; 
            reverse += ((int) Math.pow(10,length-1)) * digit;
            num /= 10 ;
            length-- ; 
        }
        if(temp == reverse){
            System.out.println(temp + " is a Palindrome.");
        }else{
            System.out.println(temp + " is not a Palindrome.");
        }
    }
}
