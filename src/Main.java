import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cap Number: ");
         int capNumber = input.nextInt();
             for(int j =0; j<capNumber; j++){
            if(isPrime(j)){
                System.out.print( j + " ; ");
            }
        }
    }
    public static boolean isPrime(int number){
        if(number<2){
            return false;
        }else if( number==2){
            return true;
        }else {
            for(int i=2; i*i <=number;i++){
                if(number%i==0){
                    return false;
                }
            }

        }
        return true;
    }

}
