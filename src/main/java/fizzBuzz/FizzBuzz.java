package fizzBuzz;

/**
 * Created by Artem on 28.02.2017.
 */
public class FizzBuzz {
    private float remainderOne;
    private float remainderTwo;

    public void multiplesOfThreeFive(int number) {
        remainderOne = number / 3;
        remainderTwo = number / 5;
        if (remainderOne % 1 == 0 & remainderTwo % 1 == 0) {
            System.out.println("FizzBuzz");
        }
        System.out.println(number);
    }

    public void multiplesOfThree(int number) {
        remainderOne = number / 3;
        remainderTwo = number / 5;
        if (remainderOne % 1 == 0) {
            System.out.println("Fizz");
        }
        System.out.println(number);
    }

    public void multiplesOfFive(int number) {
        remainderTwo = number / 5;
        if (remainderTwo % 1 == 0) {
            System.out.println("Buzz");
        }
        System.out.println(number);
    }
}
