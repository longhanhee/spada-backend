package com.hanhee.spada.service;

import com.hanhee.spada.technology.common.api.CommonResult;

public interface UmsMemberService {

    /**
     *  Tạo mã xác minh
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * Xác định xem mã xác minh và số điện thoại di động có khớp không
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
