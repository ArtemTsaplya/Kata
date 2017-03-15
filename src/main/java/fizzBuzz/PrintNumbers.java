package fizzBuzz;

/**
 * Created by Artem on 28.02.2017.
 */
public class PrintNumbers {
    private FizzBuzz fizzBuzz = new FizzBuzz();
    public void startFizzBuzz(){
        for (int i = 1; i < 100; i++) {
            fizzBuzz.multiplesOfThreeFive(i);
        }
    }
}
