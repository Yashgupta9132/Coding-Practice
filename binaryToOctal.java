import java.util.Scanner;

public class binaryToOctal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to convert from binary to octal : ");
        int binary = sc.nextInt();
        sc.close();
        convertbinaryToOctal(binary);
    }
    public static void convertbinaryToOctal(int num){
        String octal = "" ; 
        int temp = num ; 
        int batch = 0 ; 
        while(temp !=0 ){
            batch = temp % 1000;
            octal = String.valueOf(batchToOctal(batch)) + octal;
            System.out.println(octal);
            temp /= 1000;
        }
        System.out.println("The binary " + num + " has the octal value : " + octal);
    }
    public static int batchToOctal(int num){
        int sum = 0 ;
        int length = 0 ; 
        while(num!=0){
            int digit = num % 10 ;  
            sum += digit * (Math.pow(2 , length)); 
            length++ ; 
            num /= 10;
        }
        return sum ;
    }
}