
public class Program {

    public static void main(String[] args) {

       // Test your method here
    }
    
    public static String arrayAsString(int[][] array){   
        StringBuilder numbers = new StringBuilder();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int value = array[row][column];
                numbers.append(value);
            }
            numbers.append("\n");
        }
        return numbers.toString();
    }
}
