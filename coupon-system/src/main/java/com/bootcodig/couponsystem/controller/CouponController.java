package com.bootcodig.couponsystem.controller;

import com.bootcodig.couponsystem.model.Coupon;
import com.bootcodig.couponsystem.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @PostMapping("/{value}")
    public List<Coupon> generateNewCoupon(@PathVariable int value) {
        return couponService.generateNewCoupon(value);
    }

    @GetMapping("/couponDetails")
    public List<Coupon> getAllCoupons() {
        return couponService.getAllCoupons();
    }

    @PutMapping("/{CouponId}")
    public Optional<Coupon> updateCouponDetails(@PathVariable("CouponId") int couponId, @RequestBody Coupon coupon) {
        return couponService.updateCouponDetailsById(couponId, coupon);
    }

    @DeleteMapping("/{couponId}")
    public String deleteCouponById(@PathVariable("couponId") int couponId) {
        couponService.deleteCouponBYId(couponId);
        return "couponDetails deleted";
    }


}
