package com.bootcodig.couponsystem.util;

import java.util.Random;

public class CreatedBy {
    public static String createdBy()
    {
        Random random= new Random();
        String company[]={"Amazon","Flipkart","Meesho","IndiaMart","PhonePay","Paytm","GooglePay","Zomato","Swiggy"};
        int index=random.nextInt(company.length);
        return company[index];
    }

}
