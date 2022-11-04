import java.text.DecimalFormat;
import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {
        return Double.valueOf((aa.size()));
    }
    public Double sum(ArrayList<Double> aa) {
        double sum=0.00;
          DecimalFormat df=new DecimalFormat("0.00");
        for(double number:aa) {
            sum += number;
        }
        return Double.valueOf(df.format(sum));
    }
    public Double average(ArrayList<Double> aa) {
        DecimalFormat df=new DecimalFormat("0.00");

        return Double.valueOf(df.format(sum(aa)/aa.size()));
    }

}
