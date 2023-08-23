package com.bootcodig.couponsystem.controller;

import com.bootcodig.couponsystem.model.Coupon;
import com.bootcodig.couponsystem.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponController {
@Autowired
private CouponService couponService;
    @PostMapping("/couponDetails/{value}")
    public List<Coupon> generateNewCoupon(@PathVariable int value ) {
     return couponService.generateNewCoupon(value);
    }
}
