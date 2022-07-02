package ru.netology.stats.services;

public class StatsService {
    public int mySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public int myAverage(int[] array) {
        int countPosition = 0;
        for (int i = 0; i < array.length; i++) {
            countPosition = countPosition + 1;
        }
        int average = mySum(array) / countPosition;
        return average;
    }

    public int myMaxSale(int[] array) {
        int maxDay = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxDay]) {
                maxDay = i;
            }
        }
        maxDay = maxDay + 1;
        return maxDay;
    }

    public int myMinSale(int[] array) {
        int minDay = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minDay]) {
                minDay = i;
            }
        }
        minDay = minDay + 1;
        return minDay;
    }

    public int countMonthLessAverage(int[] array) {
        int countLessAverage = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < myAverage(array)) {
                countLessAverage = countLessAverage + 1;
            }
        }
        return countLessAverage;
    }

    public int countMonthMoreAverage(int[] array) {
        int countMoreAverage = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > myAverage(array)) {
                countMoreAverage = countMoreAverage + 1;
            }
        }
        return countMoreAverage;
    }
}


