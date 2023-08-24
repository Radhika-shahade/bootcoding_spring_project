package com.bootcodig.couponsystem.util;

import java.util.Random;

public class Discount {
    public static double discount()
    {
        Random random= new Random();
      double max=85.40;
      double min=15;
      return random.nextDouble(max-min);
      }

    }


