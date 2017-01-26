package exampleTDD;

import java.io.PrintStream;

/**
 * Created by Artem on 22.01.2017.
 */
public class MyNegativeNumberException extends Exception{
    public MyNegativeNumberException(String message) {
        super(message);
    }
}
