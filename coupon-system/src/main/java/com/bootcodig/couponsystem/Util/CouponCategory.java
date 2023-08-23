package com.bootcodig.couponsystem.Util;

import java.util.Random;

public class CouponCategory {
    public static String category()
    {
        Random random= new Random();
        String s[]={"Fashion","Electronics","Travel & Leisure","Tech & Gadgets","Books & Stationery","Jewelry & Accessories","Entertainment"};
        int index= random.nextInt(s.length);
        return s[index];
    }

}
