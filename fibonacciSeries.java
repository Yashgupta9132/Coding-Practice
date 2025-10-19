import java.util.Scanner;

public class fibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonnacci Series elements you want.");
        int input = sc.nextInt();
        sc.close();
        nFibonacciSeriesElements(input);
    }
    public static void nFibonacciSeriesElements(int num){
        if (num == 1 ){
            System.out.print("Fibonacci Series with 1 element is : " + 0 + " ");
        }else if (num == 2){
            System.out.print("Fibonacci Series with 2 elements is : " + 0 + " " + 1 + " ");
        }else{
            int a = 0 ; 
            int b = 1 ; 
            System.out.print("Fibonacci Series with " + num + "elements is : " + a + " " + b + " ");
            for (int i = 2 ; i < num ; i++){
                int temp  = a ; 
                a = b ;
                b += temp ;
                System.out.print(b + " "); 
            }
        }
    }
}