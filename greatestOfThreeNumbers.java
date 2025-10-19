import java.util.Scanner;

public class greatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number.");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number.");
        sc.nextLine();
        int num2 = sc.nextInt();
        System.out.println("Enter the 3rd number.");
        sc.nextLine();
        int num3 = sc.nextInt();
        compareThreeNumbers(num1 , num2 , num3 );
        sc.close();
    }
    public static void compareThreeNumbers(int num1 , int num2 , int num3){
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the greatest out of " + num1 + "," + num2 + " and " + num3 + ".");
        }else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the greatest out of " + num1 + "," + num2 + " and " + num3 + ".");
        }else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " is the greatest out of " + num1 + "," + num2 + " and " + num3 + ".");
        }else{
            System.out.println(num1 + " ," + num2 + " and " + num3 + " are all equal.");
        }
    }
}
