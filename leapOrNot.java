import java.util.Scanner;

public class leapOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to choose to check for leapality");
        int year = sc.nextInt();
        isLeapOrNot(year);
        sc.close();
    }
    public static void isLeapOrNot(int year){
        if ((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println(year + " is leap.");
        }else {
            System.out.println(year + " is not leap.");
        }
    }
}
