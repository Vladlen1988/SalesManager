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

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long croppedAverage() {
        long result = 0;
        long resultMax = max();
        long resultMin = min();
        int count = 0;
        for (long sale : sales) {
            if (sale != resultMax && sale != resultMin) {
                result += sale;
                count++;
            }
        }

        return result / count;
    }
}
