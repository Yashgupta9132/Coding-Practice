import java.util.Scanner;

public class friendlyPair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pair you want to check for perfect pair : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        isFriendlyPair(num1 , num2);
        sc.close();
    }
    public static void isFriendlyPair(int num1 , int num2){
        if (abundanceIndex(num1) == abundanceIndex(num2)){
            System.out.println(num1 + " , " + num2 +" is a Friendly Pair.");
        }else{
            System.out.println(num1 + " , " + num2 +" is not a Friendly Pair.");
        }
    }
    public static int abundanceIndex(int num){
        int abundanceIndex = -1 ; 
        if (isAdundantNumber(num)){
            abundanceIndex = sumOfPerfectFactors(num) / num ;
        }    
        return abundanceIndex;
    }
    public static boolean isAdundantNumber(int num){
        if (num < sumOfPerfectFactors(num)){
            return true ;
        }else{
            return false ;
        }
    }
    public static int sumOfPerfectFactors(int num){
        int sum = 0 ;
        for (int i = 1 ; i < num ; i++ ){
            if (num % i ==0){
                sum += i ;
            }
        }
        return sum;
    }
}