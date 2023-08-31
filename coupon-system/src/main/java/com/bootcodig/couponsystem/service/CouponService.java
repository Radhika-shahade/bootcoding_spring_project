package com.bootcodig.couponsystem.service;

import com.bootcodig.couponsystem.util.*;
import com.bootcodig.couponsystem.model.Coupon;
import com.bootcodig.couponsystem.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;

    // to create new coupon and save it into database
    public List<Coupon> generateNewCoupon(int value) {
        List<Coupon> list = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            Coupon coupon = Coupon.builder().title(CouponTitle.couponName())
                    .description(CouponDescription.description())
                    .couponCode(CouponCode.couponCode())
                    .validityDate(DateGenerator.vaildDate())
                    .type(CouponType.type())
                    .discount(Discount.discount())
                    .category(CouponCategory.category())
                    .createDate(DateGenerator.createDate())
                    .createBy(CreatedBy.createdBy())
                    .isActive(StatusGenerator.isActive())
                    .status(CouponStatus.generateStatus()).build();
            list.add(coupon);
        }
        return couponRepository.saveAll(list);
    }

    //to get all coupons
    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }


    // to delete coupon by particular id
    public void deleteCouponBYId(int couponId) {
        couponRepository.deleteById(couponId);
    }

    public Optional<Coupon> updateCouponDetailsById(int couponId, Coupon coupon) {
        Optional<Coupon> couponDetails = couponRepository.findById(couponId);
        if (couponDetails != null) {
            couponRepository.save(coupon);
        }
        return couponDetails;
    }
}
