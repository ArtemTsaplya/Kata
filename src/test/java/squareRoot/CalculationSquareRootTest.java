package squareRoot;

import org.junit.Before;
import org.junit.Test;

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

}
