import java.io.PrintStream;

/**
 * Created by Artem on 22.01.2017.
 */
public class MyNegativeNumberException extends Throwable{
    @Override
    public void printStackTrace(PrintStream s) {
        System.out.println("Negatives not allowed!");
    }
}
