package com.example.demo.service.impl;

import com.example.demo.model.dto.request.lord.LordCreateRequestDto;
import com.example.demo.model.dto.request.lord.LordUpdateRequestDto;
import com.example.demo.model.dto.response.LordResponseDto;
import com.example.demo.model.entity.Lord;
import com.example.demo.repository.LordRepository;
import com.example.demo.service.LordService;
import com.example.demo.validator.LordCreateRequestValidator;
import com.example.demo.validator.LordUpdateRequestValidator;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LordServiceImpl implements LordService {

    private final LordRepository lordRepository;
    private final ModelMapper modelMapper = new ModelMapper();
    private final LordUpdateRequestValidator updateRequestValidator;
    private final LordCreateRequestValidator createRequestValidator;
    @Override
    public void create(LordCreateRequestDto createRequestDto) throws Exception {
        createRequestValidator.validate(createRequestDto);
        Lord lord = new Lord();
        modelMapper.map(createRequestDto, lord);
        lord.setDateOfBirth(Timestamp.valueOf(createRequestDto.getDateOfBirth()));
        lordRepository.save(lord);
    }

    @Override
    public void update(LordUpdateRequestDto updateRequestDto) throws Exception {
        updateRequestValidator.validate(updateRequestDto);
        Lord lord = lordRepository.getById(updateRequestDto.getId());
        modelMapper.map(updateRequestDto, lord);
        lord.setDateOfBirth(Timestamp.valueOf(updateRequestDto.getDateOfBirth()));
        lordRepository.save(lord);
    }

    @Override
    public LordResponseDto getById(Long id) {
        Optional<Lord> lord = lordRepository.findById(id);
        if (lord.isPresent()) {
            LordResponseDto responseDto = new LordResponseDto();
            modelMapper.map(lord.get(), responseDto);
            responseDto.setDateOfBirth(lord.get().getDateOfBirth().toLocalDateTime());
            return responseDto;
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        lordRepository.deleteById(id);
    }
}
