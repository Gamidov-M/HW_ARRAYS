package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long TotalSale = 0;
        for (long sale : sales) {
            TotalSale += sale;
        }
        return TotalSale;
    }

    public long average (long[] sales){
        return sum(sales) / sales.length;
    }

    public int MontMaxSale( long[]sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales [month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int MontMinSale (long[] sales) {
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }

        return month + 1;
    }

    public int MonthsBellowAverage(long[]sales){
        int counter = 0;
        for (long sale: sales) {
            if(sale<average(sales)){
                counter++;
            }
        }
        return counter;
    }

    public int MonthsAboveAverage(long[]sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}

