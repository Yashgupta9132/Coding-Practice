import java.util.Scanner;

public class perfectNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Perfect Number : ");
        int input = sc.nextInt();
        isPerfect(input);
        sc.close();
    }
    public static void isPerfect(int num){
        int sum = 0 ;
        for (int i = 1 ; i < num ; i++){
            if (num % i == 0){
                sum = sum + i ;  
            } 
        }
        if (sum == num){
            System.out.println(num + " is a Perfect Number.");
        }
        else {
            System.out.println(num + " is a Non-perfect Number ");
        }
    }
}