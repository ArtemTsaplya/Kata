package exampleTDD;

/**
 * Created by Artem on 19.01.2017.
 */
public class StringCalculator {
    public int add(String input) throws MyNegativeNumberException {
        int result = 0;
        input = input.replace("\n", "").replace(",", ", ");
        for (String strNumber : input.split(", ")) {
            int intNumber = Integer.valueOf(strNumber);
            NumbersBiggerOneThousandIgnored.getIgnoredNumber(intNumber);
            result = intNumber + result;
            if (intNumber < 0) {
                throw new MyNegativeNumberException("Negatives not allowed!");
            }
        }
        return result;

    }

    public int add(String first, String second) {
        return Integer.valueOf(first) + Integer.valueOf(second);
    }
}
