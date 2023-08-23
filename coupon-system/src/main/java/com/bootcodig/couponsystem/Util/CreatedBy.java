package com.bootcodig.couponsystem.Util;

import java.util.Random;

public class CreatedBy {
    public static String createdBy()
    {
        Random random= new Random();
        String s[]={"Amazon","Flipkart","Meesho","IndiaMart","PhonePay","Paytm","GooglePay","Zomato","Swiggy"};
        int index=random.nextInt(s.length);
        return s[index];
    }

}
