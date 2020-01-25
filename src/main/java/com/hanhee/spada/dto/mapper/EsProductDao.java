package com.hanhee.spada.dto.mapper;

import com.hanhee.spada.elasticsearch.model.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}