package com.bootcodig.couponsystem.Util;

import java.util.Random;

public class CouponType {

    public static  String type()
    {
        Random random= new Random();
        String s[]= {"BuyOneGetOne","FreeShipping","FirstPurchase","SeasonalPromo","EndOfSeason","PercentOff"};
        int index= random.nextInt(s.length);
        return s[index];
    }

}
