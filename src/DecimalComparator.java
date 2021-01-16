import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {
    public static void main(String[] args) {

        boolean output = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(output);


    }
    public static boolean areEqualByThreeDecimalPlaces (double decimal1, double decimal2){


        BigDecimal dec1 = new BigDecimal(decimal1).setScale(3, RoundingMode.DOWN);
        BigDecimal dec2 = new BigDecimal(decimal2).setScale(3, RoundingMode.DOWN);

        System.out.println(dec1);
        System.out.println(dec2);


        if (dec1.equals(dec2)){
            return true;
        }

        return false;
    }

}
