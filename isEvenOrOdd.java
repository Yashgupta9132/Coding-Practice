import java.util.Scanner;

public class isEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check weather it is even or odd ...");
        int input = sc.nextInt();
        checkEvenOrOdd(input);
        sc.close();
    }

    public static void checkEvenOrOdd(int num){
        if (num % 2 == 0 ){
            System.out.println("Number " + num + " is Even.");
        }else{
            System.out.println("Number " + num + " is Odd.");
        }
    } 
}