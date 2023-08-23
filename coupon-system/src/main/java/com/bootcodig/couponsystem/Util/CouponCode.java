package com.bootcodig.couponsystem.Util;

import java.util.UUID;

public class CouponCode {

    public static String couponCode()
    {
        UUID uuid= UUID.randomUUID();
        return uuid.toString();
    }

}
