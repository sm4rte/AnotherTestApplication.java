package com.example.demo.controller;

import com.example.demo.model.dto.request.lord.LordCreateRequestDto;
import com.example.demo.model.dto.request.lord.LordUpdateRequestDto;
import com.example.demo.model.dto.response.LordResponseDto;
import com.example.demo.service.LordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/lord")
public class LordController {

    private final LordService lordService;

    @PostMapping
    public void create(@RequestBody LordCreateRequestDto createRequestDto) throws Exception {
        lordService.create(createRequestDto);
    }

    @PutMapping
    public void update(@RequestBody LordUpdateRequestDto updateRequestDto) throws Exception {
        lordService.update(updateRequestDto);
    }

    @GetMapping("/{lordId}")
    public LordResponseDto getById(@PathVariable("lordId") Long id) {
        return lordService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        lordService.deleteById(id);
    }
}
