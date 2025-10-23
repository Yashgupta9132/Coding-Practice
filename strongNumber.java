import java.util.Scanner;

public class strongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check for Strong Number : ");
        int num = sc.nextInt();
        sc.close();
        isStrongNumber(num);
    }
    
    public static void isStrongNumber(int num){
        int temp = num ; 
        int sum = 0 ;
        int length = String.valueOf(num).length();
        while(length != 0 ){
            int digit = temp%10 ;
            sum += factorial(digit); 
            temp = temp/10 ;
            length-- ;
        }
        if (num == sum){
            System.out.println(num + " is a Strong Number.");
        }
        else{
            System.out.println(num + " is a not Strong Number.");
        }
    }
    
    public static int factorial(int num){
        if (num == 1){
            return 1 ;
        }else 
            return num * factorial(num-1);
    }
}