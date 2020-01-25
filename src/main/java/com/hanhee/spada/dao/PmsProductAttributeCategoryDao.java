package com.hanhee.spada.dao;

import com.hanhee.spada.dto.PmsProductAttributeCategoryItem;

import java.util.List;

public interface PmsProductAttributeCategoryDao {
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
