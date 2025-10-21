import java.util.Scanner;

public class powerOfANumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Number : ");
        int baseNum = sc.nextInt();
        System.out.println("Enter the Exponent : ");
        int exponentNum = sc.nextInt();
        sc.close();
        System.out.println("Power of " + baseNum + " to the exponent "+ exponentNum + " is : " + power(baseNum , exponentNum));
    }
    public static int power(int baseNum , int exponentNum){
        int temp = 1;
        while(exponentNum!=0){
            temp *= baseNum ;
            exponentNum-- ;
        }
        return temp;
    }
}