package com.bootcodig.couponsystem.service;

import com.bootcodig.couponsystem.Util.*;
import com.bootcodig.couponsystem.model.Coupon;
import com.bootcodig.couponsystem.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;
    public List<Coupon> generateNewCoupon(int value) {
        List<Coupon>list= new ArrayList<>();
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





}
