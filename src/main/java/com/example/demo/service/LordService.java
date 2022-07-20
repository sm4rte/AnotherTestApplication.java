package com.example.demo.service;

import com.example.demo.model.dto.request.lord.LordCreateRequestDto;
import com.example.demo.model.dto.request.lord.LordUpdateRequestDto;
import com.example.demo.model.dto.response.LordResponseDto;

public interface LordService {

    LordResponseDto getById(Long id);

    void create(LordCreateRequestDto createRequestDto) throws Exception;

    void update(LordUpdateRequestDto updateRequestDto) throws Exception;

    void deleteById(Long id);
}

