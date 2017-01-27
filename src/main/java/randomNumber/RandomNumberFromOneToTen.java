package randomNumber;

import java.util.Random;

/**
 * Created by Artem on 27.01.2017.
 */
public class RandomNumberFromOneToTen {
    private static Random random = new Random();
    private static int counter;

    public int getRandomNumber() {
        int result;
        do {
            int rangeOfNumbers = 10;
            result = random.nextInt(rangeOfNumbers);
        }
        while (result == 0);
        return result;
    }

    public int returnOneTwoTreWithEachInvocation() {
        counter++;
        if (counter == 4) {
            counter = 1;
        }
        return counter;
    }
}
