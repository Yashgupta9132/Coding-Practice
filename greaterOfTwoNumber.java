import java.util.Scanner;

public class greaterOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number which you want to compare : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the 2nd number which you want to compare : ");
        sc.nextLine();
        int number2 = sc.nextInt();
        compareTwoNumber(number1 , number2);
        sc.close();
    }
    public static void compareTwoNumber(int number1, int number2){
        if(number1 > number2){
            System.out.println(number1 + " is Greater than " + number2 + ".");
        }else if(number2 > number1){
            System.out.println(number2 + " is Greater than " + number1 + ".");
        }else {
            System.out.println(number1 + " and " + number2 + " are both equal.");
        }
    }
}
