
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            
            list.add(userInput);
        }
        
        String printInputs = list.stream()
                                  .reduce("", (previousString, word) -> previousString + word + "\n");
        
        System.out.println(printInputs);

    }
}
