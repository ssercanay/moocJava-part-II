
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountOfFirst = 0;
        int amountOfSecond = 0;


        while (true) {
            System.out.println("First: " + amountOfFirst + "/100");
            System.out.println("Second: " + amountOfSecond + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add") && amount > 0) {
                if (amountOfFirst + amount > 100) {
                    amountOfFirst = 100;
                } else{
                amountOfFirst += amount;
                }
                
            }
            
            if (command.equals("move") && amountOfFirst > 0 && amount > 0) {
                if (amountOfFirst - amount >= 0) {
                if (amountOfSecond + amount > 100) {
                    amountOfSecond = 100;
                } else{
                amountOfSecond += amount;
                }
                    amountOfFirst = amountOfFirst - amount;
                } else{
                    if (amountOfSecond + amountOfFirst > 100) {
                        amountOfSecond = 100;
                    } else {
                    amountOfSecond += amountOfFirst;
                    amountOfFirst = 0;
                    }
                }                
            }
            if (command.equals("remove") && amount > 0) {
                if (amountOfSecond - amount < 0) {
                    amountOfSecond = 0;
                } else{
                amountOfSecond -= amount;
                }
                
            }
        }
    }

}
