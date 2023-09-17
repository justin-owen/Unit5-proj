import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    private String input;
    private boolean expectedOutput;
    BalancedBrackets bb = new BalancedBrackets();

    public ParameterizedTest(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<Object[]> testConditions() {
        String balancedPar = "()";
        String moreOpenPar = "(()";
        String moreClosedPar = "())";
        String startClosedPar = ")(";
        String emptyStr = "";
        String mismatched = "<{<({>}>])";
        String balancedMixed = "({[<>]})";

        Object[][] expectedOutputs = {
                { balancedPar, true },
                { moreOpenPar, false },
                { moreClosedPar, false },
                { emptyStr, true },
                { startClosedPar, false },
                { mismatched, false },
                { balancedMixed, true }
        };

        return Arrays.asList(expectedOutputs);

    }

    @Test
    public void testBalancedBrackets() {
        assertEquals(expectedOutput, bb.balancedBrackets(input));
    }
}
