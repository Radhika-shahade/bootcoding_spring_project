package com.bootcodig.couponsystem.util;

import java.util.Random;

public class CouponDescription {

    public static String description()
    {
        Random random= new Random();
        String description[] ={"Get a whopping 50% off your purchase for today only!","Enjoy free shipping on all orders with this special coupon",
        "Buy one item, get one free – don't miss this deal!","Exclusive offer for our valued members – save big!",
        "Flash sale happening this weekend – grab your deals!","Welcome new customers with a discount on your first order"};
        int index= random.nextInt(description.length);
        return description[index];

    }

}
