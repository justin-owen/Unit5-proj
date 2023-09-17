import static org.junit.Assert.*;

import org.junit.Test;

public class MissingNumberTest {
    private int[] missingLast = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] missingTwo = {1, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] missingNone = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private MissingNumber mn = new MissingNumber();

    @Test
    public void testMissingNumber_missingLast() {
        assertEquals(10, mn.missingNumber(missingLast, 10));
    }

    @Test
    public void testMissingNumber_missingTwo() {
        assertEquals(2, mn.missingNumber(missingTwo, 10));
    }

    @Test
    public void testMissingNumber_noneMissing() {
        assertEquals(0, mn.missingNumber(missingNone, 10));
    }




}
