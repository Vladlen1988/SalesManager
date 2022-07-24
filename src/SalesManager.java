public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int croppedAverage() {
        int result = 0;
        int resultMax = max();
        int resultMin = min();
        int count = 0;
        for (int sale : sales) {
            if (sale != resultMax && sale != resultMin) {
                result += sale;
                count++;
            }
        }

        return result / count;
    }
}
