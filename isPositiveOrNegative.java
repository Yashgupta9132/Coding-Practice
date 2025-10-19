import java.util.Scanner;

public class isPositiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Please enter a input to check for positive / negative or zero . ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        checkPositiveOrNegative(input);
        sc.close();
    }

    public static void checkPositiveOrNegative(int num){
        if(num > 0){
            System.out.println("Input " + num + " is Positive. ");
        }else if(num < 0 ){
            System.out.println("Input " + num + " is Negative. ");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
