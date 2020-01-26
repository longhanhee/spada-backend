package com.hanhee.spada.dao;

import com.hanhee.spada.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsAdminRoleRelationDao {

    /**
     * Nhận tất cả các quyền của người dùng (bao gồm + - quyền)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
