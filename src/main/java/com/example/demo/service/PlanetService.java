package com.example.demo.service;

import com.example.demo.model.dto.request.planet.PlanetCreateRequestDto;
import com.example.demo.model.dto.request.planet.PlanetUpdateRequestDto;
import com.example.demo.model.dto.response.PlanetResponseDto;

public interface PlanetService {

    void create(PlanetCreateRequestDto createRequestDto);

    void update(PlanetUpdateRequestDto updateRequestDto);

    PlanetResponseDto getById(Long id);

    void delete(Long id);
}
