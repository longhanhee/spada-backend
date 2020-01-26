package com.hanhee.spada.controller;

import com.hanhee.spada.model.Slide;
import com.hanhee.spada.service.SlideService;
import com.hanhee.spada.technology.common.api.CommonPage;
import com.hanhee.spada.technology.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "SlideController", description = "Trả ra trong api homepage")
@RequestMapping("/slide")
public class SlideController {
    @Autowired
    private SlideService slideService;

    @ApiOperation("Thêm mục")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:category:create')")
    public CommonResult create(@RequestBody Slide slide) {
        int count = slideService.create(slide);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("Chỉnh sửa thông tin liên quan")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:category:update')")
    public CommonResult update(@PathVariable Long id, @RequestBody Slide slide) {
        int count = slideService.update(id, slide);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("Xóa liên kết")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:category:delete')")
    public CommonResult delete(@PathVariable Long id) {
        int count = slideService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("Nhận thông tin theo id")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
//    @PreAuthorize("hasAuthority('pms:category:read')")
    public CommonResult<Slide> getItem(@PathVariable Long id) {
        Slide slide = slideService.getItem(id);
        return CommonResult.success(slide);
    }

    @ApiOperation("Phân trang list")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
//    @PreAuthorize("hasAuthority('pms:category:read')")
    public CommonResult<CommonPage<Slide>> list(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Slide> couponList = slideService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(couponList));
    }
}
