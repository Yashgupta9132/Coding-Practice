import java.util.Scanner;

public class decimalToBinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number you want to find the Binary of : ");
        int decimal = sc.nextInt();
        sc.close();
        findDecimalToBinary(decimal);
    }
    public static void findDecimalToBinary(int decimal){
        String binary = "";
        if (decimal == 0 ){
            binary = "0";
        }
        while (decimal!=0){
            int digit = decimal%2;
            binary = String.valueOf(digit) + binary ;
            decimal /= 2 ;  
        }
        System.out.println("The binary value of " + decimal + " is : " + binary);
    }
}