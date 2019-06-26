package jake.simplecryptowidget;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Utility {
    /**
     * put comma after every 3 numbers
     */
    public static String setMoneyFormat(String num) {
        try {
            num = num.replace(".0", "");
//            DecimalFormat decimalFormat = new DecimalFormat("#,###,###,###");
//            return decimalFormat.format(num);
            return NumberFormat.getNumberInstance(Locale.US).format(new BigDecimal(num));
        } catch (Exception e) {
            e.printStackTrace();
            return num;
        }
    }
}
