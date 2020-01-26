package com.hanhee.spada.dao;

import com.hanhee.spada.technology.elasticsearch.model.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}