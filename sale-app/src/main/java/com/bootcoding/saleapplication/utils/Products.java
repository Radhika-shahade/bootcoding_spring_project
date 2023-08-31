package com.bootcoding.saleapplication.utils;

import java.util.Random;

public class Products {
    public static String product()
    {
        String name[]={"laptop","cloths","tv","washing machine","bag"};
        Random random= new Random();
        int index= random.nextInt(name.length);
        return name[index];
    }

    public static Double prize()
    {
        Random random= new Random();
        double prize[]={22000.2,55000.23,78000.90,5000.67};
        int index= random.nextInt(prize.length);
        return prize[index];

    }

}
