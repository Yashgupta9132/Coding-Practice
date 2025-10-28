import java.util.Scanner;

public class lcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers you wnat to find the LCM of :  ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        findLCM(num1 , num2);
    }
    public static void findLCM(int num1, int num2){
        int lcm = (num1*num2) / findHCF(num1, num2) ;
        System.out.println("The LCM of " + num1 + " and " + num2 + " is : " + lcm + " .");
    }
    public static int findHCF(int num1, int num2){
        int hcf = 0 ; 
        int min = 0 ; 
        if (num1 > num2 ) min = num2 ;
        else min = num1 ;
        for (int i = 1 ; i <= min ; i++){
            if ((num1 % i == 0) && (num2 % i == 0)){
                hcf = i ;
            }
        }
        return hcf ; 
    }
}