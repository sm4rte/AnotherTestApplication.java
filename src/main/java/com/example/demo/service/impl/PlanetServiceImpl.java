package com.example.demo.service.impl;

import com.example.demo.model.dto.request.planet.PlanetCreateRequestDto;
import com.example.demo.model.dto.request.planet.PlanetUpdateRequestDto;
import com.example.demo.model.dto.response.PlanetResponseDto;
import com.example.demo.model.entity.Planet;
import com.example.demo.repository.PlanetRepository;
import com.example.demo.service.PlanetService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlanetServiceImpl implements PlanetService {

    private final PlanetRepository planetRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public void create(PlanetCreateRequestDto createRequestDto) {
        Planet planet = new Planet();
        modelMapper.map(createRequestDto, planet);
        planetRepository.save(planet);
    }

    @Override
    public void update(PlanetUpdateRequestDto updateRequestDto) {
        Planet planet = planetRepository.getById(updateRequestDto.getId());
        modelMapper.map(updateRequestDto, planet);
        planetRepository.save(planet);
    }

    @Override
    public PlanetResponseDto getById(Long id) {
        Optional<Planet> planet = planetRepository.findById(id);
        if (planet.isPresent()) {
            PlanetResponseDto planetResponseDto = new PlanetResponseDto();
            modelMapper.map(planet.get(), planetResponseDto);
            return planetResponseDto;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        planetRepository.deleteById(id);
    }
}
