package com.hanhee.spada.mapper;

import com.hanhee.spada.model.Slide;
import com.hanhee.spada.model.SlideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlideMapper {
    long countByExample(SlideExample example);

    int deleteByExample(SlideExample example);

    int deleteByPrimaryKey(Long slideId);

    int insert(Slide record);

    int insertSelective(Slide record);

    List<Slide> selectByExample(SlideExample example);

    Slide selectByPrimaryKey(Long slideId);

    int updateByExampleSelective(@Param("record") Slide record, @Param("example") SlideExample example);

    int updateByExample(@Param("record") Slide record, @Param("example") SlideExample example);

    int updateByPrimaryKeySelective(Slide record);

    int updateByPrimaryKey(Slide record);
}