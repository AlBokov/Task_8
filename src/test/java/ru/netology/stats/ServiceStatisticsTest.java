package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceStatisticsTest {
    ServiceStatistics service = new ServiceStatistics();
    long[] statistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void sumAllSales() {
        long expected = 180;
        long actual = service.sumAllSales(statistics);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void averageAmount() {
        long expected = 15;
        long actual = service.averageAmount(statistics);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void monthMax() {
        int expected = 6;
        int actual = service.monthMax(statistics);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void monthMin() {
        long expected = 9;
        long actual = service.monthMin(statistics);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void numberMonthsLower() {
        int expected = 5;
        int actual = service.numberMonthsLower(statistics);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void numberMonthsHigher() {
        int expected = 5;
        int actual = service.numberMonthsHigher(statistics);
        Assertions.assertEquals(expected, actual);
    }
}
