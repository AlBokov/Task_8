import ru.netology.stats.ServiceStatistics;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] statistics = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        ServiceStatistics service = new ServiceStatistics();

        int stat = service.sumAllSales(statistics);
        System.out.println("Общая сумма за год = " + stat);

        int average = service.averageAmount(statistics);
        System.out.println("Средняя сумма за год = " + average);

        int monthMax = service.monthMax(statistics);
        System.out.println("Месяц с максимальным показателем " + monthMax);

        int monthMin = service.monthMin(statistics);
        System.out.println("Месяц с минимальным показателем " + monthMin);


        int numberMonthMin = service.numberMonthsLower(statistics);
        System.out.println("Количество месяцев с показателем ниже среднего = " + numberMonthMin);



        int numberMonthMax = service.numberMonthsHigher(statistics);
        System.out.println("Количество месяцев с выше среденего = " + numberMonthMax);


        }
}
