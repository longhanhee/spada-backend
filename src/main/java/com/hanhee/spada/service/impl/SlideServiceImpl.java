package com.hanhee.spada.service.impl;

import com.github.pagehelper.PageHelper;
import com.hanhee.spada.mapper.SlideMapper;
import com.hanhee.spada.model.Slide;
import com.hanhee.spada.model.SlideExample;
import com.hanhee.spada.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class SlideServiceImpl implements SlideService {

    @Autowired
    SlideMapper slideMapper;

    @Override
    public int create(Slide slide) {
//        slide.setCreateTime(new Date());
        return slideMapper.insert(slide);
    }

    @Override
    public int update(Long id, Slide slide) {
        slide.setSlideId(id);
        return slideMapper.updateByPrimaryKey(slide);
    }

    @Override
    public int delete(Long id) {
        return slideMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Slide getItem(Long id) {
        return slideMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Slide> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SlideExample example = new SlideExample();
        if (!StringUtils.isEmpty(keyword)) {
            example.createCriteria().andTitleLike("%" + keyword + "%");
        }
        return slideMapper.selectByExample(example);
    }

    @Override
    public long getCount(Long cardId) {
        SlideExample example = new SlideExample();
        example.createCriteria()
                .andCardIdEqualTo(cardId);
        return slideMapper.countByExample(example);
    }
}
