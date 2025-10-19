import java.util.Scanner;

public class armstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range starting value in which you want to find all the numbers.");
        int rangeStart = sc.nextInt();
        System.out.println("Enter the range end value in which you want to find all the numbers.");
        int rangeEnd = sc.nextInt();
        sc.close();
        isArmstrongInRange(rangeStart, rangeEnd);
    }
    public static void isArmstrongInRange(int rangeStart , int rangeEnd){
        for (int i = rangeStart ; i <= rangeEnd ; i++){
            int num = i ;
            int temp = num ; 
            int sum = 0 ; 
            int length = String.valueOf(num).length();
            while (num!=0){
                int digit = num%10 ;
                sum += Math.pow(digit, length);
                num /= 10 ;
            }
            if(temp==sum){
                System.out.print(temp + " ");
            }
        }
    }
}
