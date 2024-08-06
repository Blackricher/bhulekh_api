package com.bhulekh.service;

import com.bhulekh.models.Lr_payblexModel;

public class Lr_payblexModelImpl implements Lr_payblexModel {
    private Float land_revenue_payable;
    private Integer counts;

    @Override
    public Float getLand_revenue_payable() {
        return land_revenue_payable;
    }

    @Override
    public Integer getCounts() {
        return counts;
    }

    @Override
    public void setLand_revenue_payable(Float land_revenue_payable) {
        this.land_revenue_payable = land_revenue_payable;
    }

    @Override
    public void setCounts(Integer counts) {
        this.counts = counts;
    }
}

