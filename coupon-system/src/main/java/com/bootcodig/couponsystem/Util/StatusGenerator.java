package com.bootcodig.couponsystem.Util;

import java.util.Random;

public class StatusGenerator {
    public static boolean isActive(){
        boolean [] isActive ={true,false};
        Random random =new Random();
        int i = random.nextInt(isActive.length);
        return isActive[i];
    }

}
