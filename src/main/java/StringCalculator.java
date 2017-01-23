/**
 * Created by Artem on 19.01.2017.
 */
public class StringCalculator {
    public int add(String input) {
        int result = 0;
        input = input.replace("\n", "");
        try {
            for (String strNumber : input.split(", ")) {
                int intNumber = Integer.valueOf(strNumber);
                NumbersBiggerOneThousandIgnored.getIgnoredNumber(intNumber);
                result = intNumber + result;
                if (intNumber < 0) {
                    throw new MyNegativeNumberException();
                }
            }
        } catch (MyNegativeNumberException e) {
            e.printStackTrace();
        }
            return result;
    }

    public int add(String first, String second) {
        return Integer.valueOf(first) + Integer.valueOf(second);
    }
}
