# Менеджер по продажам
### Основной метод int max() возвращает наибольшую сумму продажи
```java
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
```