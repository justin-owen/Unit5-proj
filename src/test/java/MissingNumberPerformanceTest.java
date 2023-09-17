import static org.junit.Assert.*;

import org.junit.Test;

public class MissingNumberPerformanceTest {

    private int[] missingLast = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingTwo = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int size = 10;
    private MissingNumber mn = new MissingNumber();

    @Test(timeout=100000)
    public void testMissingNumber_Performance() {
        for (int i = 0; i < 100000; i += 1) {
            mn.missingNumber(missingLast, size);
            mn.missingNumber(missingTwo, size);
            mn.missingNumber(missingNone, size);
        }
    }

    @Test(timeout=100000)
    public void testMissingNumberSort_Performance() {
        for (int i = 0; i < 100000; i += 1) {
            mn.missingNumberSort(missingLast, size);
            mn.missingNumberSort(missingTwo, size);
            mn.missingNumberSort(missingNone, size);

        }
    }

    @Test(timeout=100000)
    public void testMissingNum_Performance() {
        for (int i = 0; i < 100000; i += 1) {
            mn.missingNum(missingLast, size);
            mn.missingNum(missingTwo, size);
            mn.missingNum(missingNone, size);
        }
    }
}
