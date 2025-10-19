import java.util.Scanner;


public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want the sum of natural numbers. ");
        int input = sc.nextInt();
        sumOfFirstNNumbers(input);
    }
    public static void sumOfFirstNNumbers(int num){
        System.out.println("The sum of first "+ num + " natural numbers is " + (num*(num+1)/2) + " .");
    }
}
