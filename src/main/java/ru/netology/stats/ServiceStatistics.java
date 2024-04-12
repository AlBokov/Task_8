package ru.netology.stats;

public class ServiceStatistics {


    // Считаем общую сумму стастистики
    public long sumAllSales(long[] statistics) {
        int totalАmount = 0;
        for (int i = 0; i < statistics.length; i++) {
            totalАmount = (int) (totalАmount + statistics[i]);
        }
        return totalАmount;
    }


    // Считаем среднюю сумму по статистике в месяц
    public long averageAmount(long[] statistics) {

        long totalАmount = sumAllSales(statistics);
        return totalАmount / (statistics.length);

    }


    // Находим месяц с максимальным показателем
    public int monthMax(long[] statistics) {
        long max = statistics[0];
        int month = 0;
        for (int i = 0; i < statistics.length; i++) {
            if (statistics[i] > max) {
                max = statistics[i];
                month = i;
            }
        }
        return month + 1;
    }


    // Находим месяц с минимальным показателем
    public int monthMin(long[] statistics) {
        long min = statistics[0];
        int month = 0;
        for (int i = 0; i < statistics.length; i++) {
            if (statistics[i] < min) {
                min = statistics[i];
                month = i;
            }
        }
        return month + 1;
    }


    // Находим количество месяцев с показателем ниже среднего
    public int numberMonthsLower(long[] statistics) {
        int numberMonthMin = 0;
        int averageIndicator = (int) averageAmount(statistics);
        for (int i = 0; i < statistics.length; i++) {
            if (statistics[i] < averageIndicator) {
                numberMonthMin++;
            } if (statistics[i] > averageIndicator) {

            }
        }
        return numberMonthMin;
    }

    // Находим количество месяцев с показателем выше среднего
    public int numberMonthsHigher(long[] statistics) {
        int numberMonthMax = 0;
        int averageIndicator = (int) averageAmount(statistics);
        for (int i = 0; i < statistics.length; i++) {
            if (statistics[i] > averageIndicator) {
                numberMonthMax++;
            }
        }
        return numberMonthMax;
    }
}

