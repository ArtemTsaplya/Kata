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
//        String [] array = new String{input};
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < input.length(); i++) {
//                for (int j = 0; j < input.length(); j++) {
//                    String stringNumber = String.valueOf(input.charAt(j));
//                    if (stringNumber.equals(",") | stringNumber.equals(" ")) {
//                        break;
//                    } else {
//                        builder.append(stringNumber);
//                    }
//                    i++;
//            }
//
//            result = Integer.valueOf(builder.toString()) + result;
//
//        }
            return result;
    }

    public int add(String first, String second) {
        String df = "sdf dsfs s ssf s";
        int sum = Integer.valueOf(first) + Integer.valueOf(second);
        return sum;
    }
}
