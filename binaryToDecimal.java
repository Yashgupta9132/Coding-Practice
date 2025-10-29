import java.util.Scanner;

public class binaryToDecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number to convert to Decimal : ");
        int num = sc.nextInt();
        sc.close();
        convertBinaryToDecimal(num);
    }
    public static void convertBinaryToDecimal(int num){
        int temp = num ; 
        int decimal = 0 ; 
        int power = 0 ;
        while(temp != 0){
            int digit = temp % 10 ;
            decimal += digit * Math.pow(2 , power);
            power++;
            temp /= 10 ;
        }
        System.out.println("The Decimal value of the binary " + num + " is : " + decimal);
    }
}