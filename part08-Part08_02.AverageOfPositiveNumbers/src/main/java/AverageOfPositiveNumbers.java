
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum  = 0;
        int counter = 0;
        while(true){
            int addNumber = scanner.nextInt();
            if (addNumber > 0) {
                sum = sum + addNumber;
                counter++;
            }
            if (addNumber == 0) {
                if (sum > 0) {
                    System.out.println(sum/counter);
                    break;
                } else{
                    System.out.println("Cannot calculate the average");
                    break;
                }
            }
            
        }

    }
}
