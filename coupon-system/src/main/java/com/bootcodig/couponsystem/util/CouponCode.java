package com.bootcodig.couponsystem.util;

import java.util.UUID;

public class CouponCode {

    public static String couponCode() {
        UUID uuid = UUID.randomUUID();
        String uuidStr = uuid.toString().replace("-", ""); // Remove hyphens
        String truncatedUuidStr = uuidStr.substring(0, 10); // Take the first 10 characters
        return truncatedUuidStr;
    }

}
