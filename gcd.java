import java.util.Scanner;

public class gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you want to find the gcd of : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        findGcd(num1 , num2);
    }
    public static void findGcd(int num1 , int num2){
        int gcd = 0 ; 
        int min = 0 ; 
        if (num1 > num2) min = num2 ;
        else min = num1 ;
        for (int i = 1 ; i <= min ; i++){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i ;
            }
        }
        System.out.println("The Gcd of " + num1 + " and " + num2 + " is : " + gcd);
    }
}