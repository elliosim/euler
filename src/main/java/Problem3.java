import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    public List<Integer> getPrimesOfNumber(int input) {

        List<Integer> output = new ArrayList<>();

        // loop through all numbers up to input
        for(int i = 2; i < input; i++) {
            if(isPrime(i)) {
                output.add(i);
            }
        }

        return output;
    }

    public boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2) return true;

        for(int i = 2; i <= Math.sqrt(n); i++) {



            for(int j = 3; j < n; j++) {
                if(i % j == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
