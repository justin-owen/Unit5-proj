import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBracketsTest {
    String balancedPar = "()";
    String moreOpenPar = "(()";
    String moreClosedPar = "())";
    String startClosedPar = ")(";
    String emptyStr = "";
    String mismatched = "<{<({>}>])";
    String balancedMixed = "({[<>]})";

    BalancedBrackets bb = new BalancedBrackets();

    @Test
    public void testBalancedBrackets_balancedPar() {
        assertTrue(bb.balancedBrackets("()"));
    }

    @Test
    public void testBalancedBrackets_moreOpenPar() {
        assertFalse(bb.balancedBrackets("(()"));
    }

    @Test
    public void testBalancedBrackets_moreClosedPar() {
        assertFalse(bb.balancedBrackets("())"));
    }

    @Test
    public void testBalancedBrackets_startClosedPar() {
        assertFalse(bb.balancedBrackets(")("));
    }

    @Test
    public void testBalancedBrackets_emptyStr() {
        assertTrue(bb.balancedBrackets(""));
    }

    @Test
    public void testBalancedBrackets_mismatched() {
        assertFalse(bb.balancedBrackets("<{<({>}>])"));
    }

    @Test
    public void testBalancedBrackets_balancedMixed() {
        assertTrue(bb.balancedBrackets("({[<>]})"));
    }

}
