package com.hanhee.spada.dto;

import com.hanhee.spada.mbg.model.PmsProductAttribute;
import com.hanhee.spada.mbg.model.PmsProductAttributeCategory;

import java.util.List;

public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    private List<PmsProductAttribute> productAttributeList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }
}
