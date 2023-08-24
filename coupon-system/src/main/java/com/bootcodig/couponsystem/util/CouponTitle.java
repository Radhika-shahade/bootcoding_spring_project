package com.bootcodig.couponsystem.util;

import java.util.Random;

public class CouponTitle {

    public  static String couponName()
    {
        String couponName[] ={"First order offer","Weekly deal","DiscountDelight"
                ,"Flash sale offer","PromoPerks2023","SaveMoreWave",
                "MegaSaverDeal","VoucherBoostX"};
        Random random = new Random();
        int index= random.nextInt(couponName.length);
        return couponName[index];
    }
}

