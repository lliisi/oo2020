import java.util.Scanner;
/**
 * Numbers
 */
public class Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sisesta arv: ");
        int number = input.nextInt();
        
        dividing(number);
        primeNumber(number);

    }

    public static void dividing(int number){

        if(number % 2 == 0){
            System.out.println("Arv jagub kahega");
        } else {
            System.out.println("Arv ei jagu kahega");
        }
        if(number % 3 == 0){
            System.out.println("Arv jagub kolmega");
        } else {
            System.out.println("Arv ei jagu kolmega");
        }
        if(number % 5 == 0){
            System.out.println("Arv jagub viiega");
        } else {
            System.out.println("Arv ei jagu viiega");
        }
        if(number % 7 == 0){
            System.out.println("Arv jagub seitsmega");
        } else {
            System.out.println("Arv ei jagu seitsmega");
        }
        return;

    }
    public static void primeNumber(int number){
        
        boolean prime = false;

        for(int i = 2; i<= number/2; ++i){
            if(number % i == 0){
                prime = true;
                break;
            }
        }
        
        if(!prime)
            System.out.println("Arv on algarv");
        else
            System.out.println("Arv ei ole algarv");

        return;
    }
    
}