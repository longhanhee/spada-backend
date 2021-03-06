package com.hanhee.spada.technology.common.api;


import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.domain.Page;
import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

/**
 * 分页数据封装类
 * Created by macro on 2019/4/19.
 */

@Data
public class CommonPage<T> {

    @JsonProperty("page_num")
    private Integer pageNum;
    @JsonProperty("page_size")
    private Integer pageSize;
    @JsonProperty("total_page")
    private Integer totalPage;
    @JsonProperty("total")
    private Long total;
    @JsonProperty("list")
    private List<T> list;

    /**
     * 将PageHelper分页后的list转为分页信息
     */
    public static <T> CommonPage<T> restPage(List<T> list) {
        CommonPage<T> result = new CommonPage<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    public static <T> CommonPage<T> restPage(Page<T> pageInfo) {
        CommonPage<T> result = new CommonPage<T>();
        result.setTotalPage(pageInfo.getTotalPages());
        result.setPageNum(pageInfo.getNumber());
        result.setPageSize(pageInfo.getSize());
        result.setTotal(pageInfo.getTotalElements());
        result.setList(pageInfo.getContent());
        return result;
    }
}
