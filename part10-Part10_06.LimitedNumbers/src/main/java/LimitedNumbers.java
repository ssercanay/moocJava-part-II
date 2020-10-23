
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int userInput = scanner.nextInt();
            if (userInput < 0) {
                break;
            }
            
            list.add(userInput);
            
            list.stream()
            .filter(number -> (number >= 1) && (number <= 5))
            .forEach(number -> System.out.println(number));
        }
    }
}
