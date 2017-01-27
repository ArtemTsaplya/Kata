package squareRoot;

import org.junit.Before;
import org.junit.Test;
import randomNumber.RandomNumberFromOneToTen;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Artem on 26.01.2017.
 */
public class CalculationSquareRootTest {

    private InputNumber input;
    private RandomNumberFromOneToTen random;

    @Before
    public void setUp() throws Exception {
        input = new InputNumber();
        random = new RandomNumberFromOneToTen();
    }

    @Test
    public void enterNegativeNumber() throws Exception {
        int actualResult = input.naturalInteger(2);
        assert actualResult >= 0;
    }

    @Test
    public void roundingToNaturalNumberTest() throws Exception {
        int expected = 9;
        int actualResult = Calculation.rounding(9.9999);
        assertThat(actualResult, is(expected));
    }
    @Test
    public void roundingSqrtTest() throws Exception {
        int expected = 3;
        int actualResult = Calculation.sqrt(15);
        assertThat(actualResult, is(expected));
    }

    @Test
    public void randomNumberFromOneToTenTest() throws Exception {
        int actualResult = random.getRandomNumber();
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int n : array) {
            if (actualResult == n) {
                break;
            }
        }
    }

    @Test
    public void returnOneTwoOrThreeTest() throws Exception {
        int counter = 1;
        for (int i = 1; i < 10; i++) {
            int result = random.returnOneTwoTreWithEachInvocation();
            if (counter == 4){counter = 1;}
            assert result == counter;
            counter++;
        }
    }
}
