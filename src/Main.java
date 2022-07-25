public class Main {
    public static void main(String[] args) {
        int[] sales = {1000, 2000, 1500};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Oбрезанное среднее = " + salesManager.croppedAverage());
    }
}
