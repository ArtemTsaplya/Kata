package squareRoot;

public class Calculation {
    public static int sqrt(int number) {
        if (number == 0) {
            return 0;
        }
        double a;
        double squareRoot = number / 2;           // initial approximation
        do {
            a = squareRoot;                       //
            squareRoot = (a + (number / a)) / 2;  // by Newton's method using the formula
        } while ((a - squareRoot) != 0);          // finding approach
        return rounding(squareRoot);
    }

    public static int rounding(double result) {
        result = Math.floor(result);               // rounded down to the nearest integer
        return (int) result;                       // casting double to an int, and returns the result
    }
}
