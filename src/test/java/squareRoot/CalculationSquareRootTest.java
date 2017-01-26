package squareRoot;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

/**
 * Created by Artem on 26.01.2017.
 */
public class CalculationSquareRootTest {

    private InputNumber input;

    @Before
    public void setUp() throws Exception {
        input = new InputNumber();
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
}
