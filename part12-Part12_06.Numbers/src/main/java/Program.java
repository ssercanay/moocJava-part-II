
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        Random ladyLuck = new Random(); 
        int howMany = scanner.nextInt();
        
        for (int i = 0; i < howMany; i++) {
            int randomNumber = ladyLuck.nextInt(11);
            System.out.println(randomNumber);
        }
    }

}
