package com.bootcodig.couponsystem.Util;

import java.util.Random;

public class CouponTitle {

    public  static String couponName()
    {
        String s[] ={"First order offer","Weekly deal","DiscountDelight"
                ,"Flash sale offer","PromoPerks2023","SaveMoreWave",
                "MegaSaverDeal","VoucherBoostX"};
        Random random = new Random();
        int index= random.nextInt(s.length);
        return s[index];
    }
}

