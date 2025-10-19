import java.util.Scanner;
import java.lang.Math;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check for prime or not.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);
        sc.close();
    }
    public static void isPrime(int num){
        if (num == 1){
            System.out.println(num + " is Composite.");
        }
        else{
            int count = 1 ;
    
            for(int i = 2 ; i <= Math.sqrt(num) ; i++){
                if(num%i == 0){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(num + " is Prime .");
            }else{
                System.out.println(num + " is Composite.");
            }
        }
    }
}
