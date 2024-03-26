package ru.netology.stats;

public class ServiceStatistics {


    // Считаем общую сумму стастистики
    public int sumAllSales(int[] statistics) {
        int totalАmount = 0;
        for (int i = 0; i < statistics.length; i++) {
            totalАmount = totalАmount + statistics[i];
        }
        return totalАmount;
    }


    // Считаем среднюю сумму по статистике в месяц
    public int averageAmount(int[] statistics) {

        int totalАmount = sumAllSales(statistics);
        return totalАmount / (statistics.length);

    }


    // Находим месяц с максимальным показателем
    public int monthMax(int[] statistics) {
        int max = statistics[0];
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
    public int monthMin(int[] statistics) {
        int min = statistics[0];
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
    public int numberMonthsLower(int[] statistics) {
        int numberMonthMin = 0;
        int averageIndicator = averageAmount(statistics);
        for (int i = 0; i < statistics.length; i++) {
            if (statistics[i] < averageIndicator) {
                numberMonthMin++;
            } if (statistics[i] > averageIndicator) {

            }
        }
        return numberMonthMin;
    }

    // Находим количество месяцев с показателем выше среднего
    public int numberMonthsHigher(int[] statistics) {
        int numberMonthMax = 0;
        int averageIndicator = averageAmount(statistics);
        for (int i = 0; i < statistics.length; i++) {
            if (statistics[i] > averageIndicator) {
                numberMonthMax++;
            }
        }
        return numberMonthMax;
    }
}

