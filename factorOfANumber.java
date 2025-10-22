import java.util.Scanner;

public class factorOfANumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the Factor of : ");
        int input = sc.nextInt();
        sc.close();
        factors(input);
    }
    public static void factors(int input){
        System.out.print("Factors of " + input + " are as follows : ");
        for (int i = 1 ; i <= input ; i++){
            if (input % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
