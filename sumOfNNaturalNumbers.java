import java.util.Scanner;

public class sumOfNNaturalNumbers {
    public static void main(String[] args){
        System.out.println("Enter the number of items you want the sum.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        sumOfNumbers(input);
    }
    public static void sumOfNumbers(int num){
        int sum = 0 ;
        for(int i = 1 ; i <= num ; i++ ){
            sum += i ;
        }
        System.out.println("Sum of " + num + " is " + sum + " .");
    }
}