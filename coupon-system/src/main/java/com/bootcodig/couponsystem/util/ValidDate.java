package com.bootcodig.couponsystem.util;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ValidDate {

    public static Date randomDate() {
        long aDay = TimeUnit.DAYS.toMillis(1); // 1 day
        long now = new Date().getTime(); // current time
        Date yesterday = new Date(now - aDay);
        Date aYearAgo = new Date(now - aDay * 365);
        return between(aYearAgo, yesterday);
    }

    private static Date between(Date startInclusive, Date endExclusive) {
        long startMillis = startInclusive.getTime();
        long endMillis = endExclusive.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
    }

}
