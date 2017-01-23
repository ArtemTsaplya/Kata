import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Artem on 19.01.2017.
 */
public class StringCalculatorTest {

    private StringCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new StringCalculator();
    }

    @Test
    public void isNotNullWhenCreateNewInstance() throws Exception {
        assertNotNull(calculator);
    }

    @Test
    public void isOneWhenPassOneIntoMethodAdd() throws Exception {
        int expected = 1;
        int actualResult = calculator.add("1");
        assertThat(actualResult, is(expected));
    }

    @Test
    public void isTwoSumOfOneAndOne() throws Exception {
        int expectedSum = 2;
        int actualResult = calculator.add("1", "1");
        assertThat(actualResult, is(expectedSum));
    }

    @Test
    public void isFourSumOfTwoAndTwo() throws Exception {
        int expectedSum = 4;
        int actualResult = calculator.add("2", "2");
        assertThat(actualResult, is(expectedSum));
    }

    @Test
    public void unknownAmountNumbersSum() throws Exception {
        int expectedNumbers = 4;
        int actualResult = calculator.add("2, 2");
        assertThat(actualResult, is(expectedNumbers));
    }

    @Test
    public void deleteOtherCharacters() throws Exception {
        int expectedNumbers = 30;
        int actualResult = calculator.add("1,\n 22, 3,\n 4");
        assertThat(actualResult, is(expectedNumbers));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void negativeNumberException() throws Exception {
        thrown.expect(MyNegativeNumberException.class);
        thrown.expectMessage("Negatives not allowed!");
    }

    @Test
    public void bigNumbers() throws Exception {
        int expectedNumbers = 0;
        int actualResult = NumbersBiggerOneThousandIgnored.getIgnoredNumber(999);
        assertThat(actualResult, is(expectedNumbers));
    }
}

