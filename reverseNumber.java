import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number you want to reverse.");
        int number = sc.nextInt();
        reverseOfNumber(number);
        sc.close();
    }
    public static void reverseOfNumber(int number){
        int temp = number ; 
        int reverse = 0 ;
        int length = String.valueOf(number).length();       
        int digit = 0 ;
        while(length != 0){
            digit = temp%10; 
            reverse += ((int) (Math.pow(10,length-1)))*digit ;
            temp /=10 ; 
            length-- ;
        }
        System.out.println("reverse of " + number + " is " + reverse);
    }
}
