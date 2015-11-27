import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem3Test {

    @Test
    public void testIsPrime() throws Exception {
        Problem3 problem = new Problem3();
        assertTrue(problem.isPrime(3));
        assertFalse(problem.isPrime(4));


        assertTrue(problem.isPrime(5));

    }



    @Test
    public void testGetPrimesFor10() throws Exception {
        Problem3 problem = new Problem3();
        int[] expectedPrimes = {2,3,5,7};
        assertEquals(Arrays.toString(expectedPrimes), problem.getPrimesOfNumber(10));
    }

    @Test
    public void testGetPrimesFor15() throws Exception {
        Problem3 problem = new Problem3();
        int[] expectedPrimes = {2,3,5,7,11,13};
        assertEquals(Arrays.toString(expectedPrimes), problem.getPrimesOfNumber(15));
    }

}
