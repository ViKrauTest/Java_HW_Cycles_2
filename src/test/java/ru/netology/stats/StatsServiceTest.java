package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldSum() {
        StatsService service = new StatsService();
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageMonthlySale() {
        StatsService service = new StatsService();
        long actual = service.averageMonthlySale(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSaleMonth() {
        StatsService service = new StatsService();
        int actual = service.maxSaleMonth(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSaleMonth() {
        StatsService service = new StatsService();
        int actual = service.minSaleMonth(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountMonthsBelowAverageMonthlySale() {
        StatsService service = new StatsService();
        int actual = service.amountMonthsBelowAverageMonthlySale(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountMonthsAboveAverageMonthlySale() {
        StatsService service = new StatsService();
        int actual = service.amountMonthsAboveAverageMonthlySale(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
