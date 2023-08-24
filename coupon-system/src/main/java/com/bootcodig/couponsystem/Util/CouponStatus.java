package com.bootcodig.couponsystem.Util;

import java.util.Random;

public class CouponStatus {

    public static String generateStatus() {
        String[] status = {"Active", "Expired", "Upcoming", "Redeemed"};
        Random random = new Random();
        int index = random.nextInt(status.length);
        return status[index];
    }
}
