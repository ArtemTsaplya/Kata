package squareRoot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {
    public void inputNumber() {
        int result;
        int number;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String notification = "Enter the number: ";
        try {
            System.out.print(notification);
            number = Integer.parseInt(reader.readLine());                                   // reading from the console, record a variable
            while (number < 0) {                                                              // the cycle will be repeated until a natural number is entered
                System.out.print("Please enter a natural integer!" + "\n" + notification);
                number = Integer.parseInt(reader.readLine());
            }
            result = Calculation.sqrt(number);                                                 // calling a static method, class Calculation. An entry in the variable
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a natural integer!");
            inputNumber();                                                                      // exception handling
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
