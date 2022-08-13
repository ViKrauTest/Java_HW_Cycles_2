package ru.netology.stats;

public class StatsService {

    public long sum(int[] sales) {
        long sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonthlySale(int[] sales) {
        StatsService service = new StatsService();
        int averageSale = (int) (service.sum(sales) / sales.length);

        return averageSale;
    }

    public int maxSaleMonth(int[] sales) {
        int maxSaleMonthId = 0;
        int maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSaleMonthId = i;
                maxSale = sales[i];
            }
        }
        return (maxSaleMonthId + 1);
    }

    public int minSaleMonth(int[] sales) {
        int minSaleMonthId = 0;
        int minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSaleMonthId = i;
                minSale = sales[i];
            }
        }
        return (minSaleMonthId + 1);
    }

    public int amountMonthsBelowAverageMonthlySale(int[] sales) {
        int amountMonths = 0;
        StatsService service = new StatsService();
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < service.averageMonthlySale(sales)) {
                amountMonths++;
            }
        }
        return (amountMonths);
    }

    public int amountMonthsAboveAverageMonthlySale(int[] sales) {
        int amountMonths = 0;
        StatsService service = new StatsService();
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > service.averageMonthlySale(sales)) {
                amountMonths++;
            }
        }
        return (amountMonths);
    }

}
