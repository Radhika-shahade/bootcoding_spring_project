package com.bootcodig.couponsystem.Util;

import java.util.Random;

public class CouponStatus {

    public static String generateStatus() {
        String[] st = {"Active", "Expired", "Upcoming", "Redeemed"};
        Random random = new Random();
        int index = random.nextInt(st.length);
        return st[index];
    }
}
