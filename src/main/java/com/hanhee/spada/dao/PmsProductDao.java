package com.hanhee.spada.dao;

import com.hanhee.spada.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;

public interface PmsProductDao {
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
