
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        while(true){
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            
            inputs.add(row);
        }
        
        double averageOfNegative = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
        
                double averageOfPositive = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
                
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");        
        String calculate = scanner.nextLine();
        
        if (calculate.equals("n")) {
            System.out.println("Average of the negative numbers: " + averageOfNegative);
        }
        
        if (calculate.equals("p")) {
            System.out.println("Average of the positive numbers: " + averageOfPositive);
        }        
    }
}
