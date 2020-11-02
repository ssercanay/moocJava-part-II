package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        FlightControl flightControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        TextUI ui = new TextUI(flightControl, scanner);
        ui.start();
        // Write the main program here. It is useful to create some classes of your own.
    }
}
