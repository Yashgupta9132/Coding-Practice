import java.util.Scanner;

public class abundantNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check for Abundant Number : ");
        int num = sc.nextInt();
        sc.close();
        isAdundantNumber(num);
    }
    public static void isAdundantNumber(int num){
        if (num < sumOfPerfectFactors(num)){
            System.out.println(num + " is a Abundant Number.");
        }else{
            System.out.println(num + " is a Abundant Number.");
        }
    }
    public static int sumOfPerfectFactors(int num){
        int sum = 0 ;
        for (int i = 1 ; i < num ; i++ ){
            if (num % i ==0){
                sum += i ;
            }
        }
        return sum;
    }
}