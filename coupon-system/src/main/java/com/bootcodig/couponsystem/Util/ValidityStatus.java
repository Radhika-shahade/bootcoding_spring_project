package com.bootcodig.couponsystem.Util;

import java.util.Random;

public class ValidityStatus {
    public static boolean isActive(){
        boolean [] a ={true,false};
        Random random =new Random();
        int i = random.nextInt(a.length);
        return a[i];
    }

}
