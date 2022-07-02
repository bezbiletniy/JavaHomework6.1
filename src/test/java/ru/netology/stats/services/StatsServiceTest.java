package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumArray() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.mySum(array);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageArray() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.myAverage(array);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maxDaySale() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxDay = 6;
        int actualMaxDay = service.myMaxSale(array);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);
    }

    @Test
    public void minDaySale() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinDay = 9;
        int actualMinDay = service.myMinSale(array);

        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void lessAverage() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedLessAverage = 5;
        int actualLessAverage = service.countMonthLessAverage(array);

        Assertions.assertEquals(expectedLessAverage, actualLessAverage);
    }

    @Test
    public void moreAverage() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMoreAverage = 5;
        int actualMoreAverage = service.countMonthMoreAverage(array);

        Assertions.assertEquals(expectedMoreAverage, actualMoreAverage);
    }
}

