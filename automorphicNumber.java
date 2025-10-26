import java.util.Scanner;

public class automorphicNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you what to check for Automorphic Number : ");
        int num = sc.nextInt();
        sc.close();
        isAutomorphicNumber(num);
    }
    public static void isAutomorphicNumber(int num){
        int square = num * num ;
        if (num%10 == square%10){
            System.out.println(num  + " is an Automorphic Number.");
        }else{
            System.out.println(num  + " is not an Automorphic Number.");
        }
    }
}