package BTThay.B2;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer o1, Computer o2) {
        return (int) (o2.caculateSellPrice()-o1.caculateSellPrice());
    }
}
