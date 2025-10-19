import java.util.Scanner;

public class sumInRange {
    public static void main(String [] args){
        System.out.println("Sum of which you want the range to start from.");
        Scanner sc = new Scanner(System.in);
        int rangeStart = sc.nextInt();
        System.out.println("Sum of which you want the range to end.");
        sc.nextLine();
        int rangeEnd = sc.nextInt();
        
        sumOfRange(rangeStart , rangeEnd); 

        sc.close();
    }
    public static void sumOfRange(int rangeStart , int rangeEnd){
        int sum = 0 ;
        for (int i=rangeStart ; i<=rangeEnd ; i++ ){
            sum += i;
        } 
        System.out.println("The Sum of Range is " + sum + ".");
    }
}
