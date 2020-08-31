import java.util.ArrayList;
import java.util.List;

class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> eureka = new ArrayList<Long>();
        for (long i = a; i <= b; i++) {
            List<Long> digits = convertToDigits(i);
            long sum = 0;
            for (long c = 0; c < digits.size(); c++) {
                sum += Math.pow(digits.get((int) c), digits.size() - c);
            }
            if (sum == i) {
                eureka.add(i);
            }
        }
        return eureka;
    }

    public static List<Long> convertToDigits(long i){
            List<Long> digitArray = new ArrayList<Long>();
            while (i > 0) {
                digitArray.add(i % 10);
                i = i / 10;
            }
            return digitArray;
        }
    }