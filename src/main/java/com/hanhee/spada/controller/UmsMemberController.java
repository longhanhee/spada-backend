package com.hanhee.spada.controller;

import com.hanhee.spada.common.api.CommonResult;
import com.hanhee.spada.dto.VerifyAuthCodeParam;
import com.hanhee.spada.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(tags = "UmsMemberController", description = "Quản lý đăng ký thành viên")
@RequestMapping("/sso")
public class UmsMemberController {
    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("Nhận mã xác minh")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone) {
        return memberService.generateAuthCode(telephone);
    }

    @ApiOperation("Xác minh mã")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestBody VerifyAuthCodeParam verifyAuthCodeParam) {
        return memberService.verifyAuthCode(verifyAuthCodeParam.getTelephone(), verifyAuthCodeParam.getAuthCode());
    }
}
