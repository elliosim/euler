import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem3Test {
    @Test
    public void testGetPrimesFor10() throws Exception {
        Problem3 problem = new Problem3();
        int[] expectedPrimes = {2,3,5,7};
        assertEquals(Arrays.toString(expectedPrimes), Arrays.toString(problem.getPrimesOfNumber(10)));
    }

    @Test
    public void testGetPrimesFor15() throws Exception {
        Problem3 problem = new Problem3();
        int[] expectedPrimes = {2,3,5,7,11,13};
        assertEquals(Arrays.toString(expectedPrimes), Arrays.toString(problem.getPrimesOfNumber(15)));
    }

}
