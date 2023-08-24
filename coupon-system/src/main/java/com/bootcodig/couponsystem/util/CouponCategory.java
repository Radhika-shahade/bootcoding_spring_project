package com.bootcodig.couponsystem.util;

import java.util.Random;

public class CouponCategory {
    public static String category()
    {
        Random random= new Random();
        String categories[]={"Fashion","Electronics","Travel & Leisure","Tech & Gadgets","Books & Stationery","Jewelry & Accessories","Entertainment"};
        int index= random.nextInt( categories.length);
        return  categories[index];
    }

}
