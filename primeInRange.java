import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the opening range in which you want to find the Primes.");
        int rangeStart = sc.nextInt();
        System.out.println("Enter the closing range in which you want to find the Primes.");
        int rangeEnd = sc.nextInt();
        primesInRange(rangeStart , rangeEnd);
        sc.close();
    }
    public static void primesInRange(int rangeStart , int rangeEnd){
        for(int i = rangeStart ; i<= rangeEnd ; i++){
            if (i == 1){}
            else{
                int count = 1 ;    
                for(int j = 2 ; j <= Math.sqrt(i) ; j++){
                    if(i%j == 0){
                        count++;
                    }
                }
                if (count == 1){
                    System.out.print(i + " ");
                }
                count = 0 ;
            }
        }
    }
}
