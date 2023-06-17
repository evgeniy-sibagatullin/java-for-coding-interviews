import org.junit.Test;

import static org.example.LeetCode338CountingBits.countBits;
import static org.example.LeetCode338CountingBits.countBitsForASpecific;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LeetCode338CountingBitsTests {

    @Test
    public void testCountingBits() {
        assertArrayEquals(new int[]{0}, countBits(0));
        assertArrayEquals(new int[]{0,1}, countBits(1));
        assertArrayEquals(new int[]{0,1,1}, countBits(2));
        assertArrayEquals(new int[]{0,1,1,2}, countBits(3));
        assertArrayEquals(new int[]{0,1,1,2,1}, countBits(4));
        assertArrayEquals(new int[]{0,1,1,2,1,2}, countBits(5));
        assertArrayEquals(new int[]{0,1,1,2,1,2,2}, countBits(6));
        assertArrayEquals(new int[]{0,1,1,2,1,2,2,3}, countBits(7));
    }

    @Test
    public void testCountingBitsForSpecificNumber() {
        assertEquals(8, countBitsForASpecific(255));
        assertEquals(1, countBitsForASpecific(Integer.MIN_VALUE));
        assertEquals(32, countBitsForASpecific(-1));
    }
}
