package com.hanhee.spada.service;

import com.hanhee.spada.model.Slide;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SlideService {
    @Transactional
    int create(Slide slide);

    int update(Long id, Slide slide);

    int delete(Long id);

    Slide getItem(Long id);

    List<Slide> list(String keyword, Integer pageSize, Integer pageNum);

    long getCount(Long cardId);
}
