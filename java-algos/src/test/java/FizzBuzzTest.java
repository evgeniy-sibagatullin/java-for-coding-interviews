import org.junit.Test;

import static org.example.LeetCode338CountingBits.countBitsForASpecific;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testCountingBitsForSpecificNumber() {
        assertEquals(8, countBitsForASpecific(255));
        assertEquals(1, countBitsForASpecific(Integer.MIN_VALUE));
        assertEquals(32, countBitsForASpecific(-1));
    }

}
