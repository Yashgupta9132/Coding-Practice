import java.util.Scanner;

public class hcf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find the hcf of : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        findHcf(num1 , num2);
        sc.close();
    }
    public static void findHcf(int num1 , int num2){
        int min = 0 ;
        int hcf = 0 ;
        if (num1 > num2) min = num2 ;
        else min = num1 ;

        for(int i = 1 ; i <= min ; i++){
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i ;
            }
        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is : " + hcf +" .");
    }
}