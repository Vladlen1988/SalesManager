import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long croppedAverage() {
        Arrays.sort(sales);
        long result = 0;
        long count = 0;
        for (int i = 1; i < sales.length - 1; i++) {
            result += sales[i];
            count++;
        }
        return result / count;
    }
}
