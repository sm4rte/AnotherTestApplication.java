package com.example.demo.controller;

import com.example.demo.model.dto.request.planet.PlanetCreateRequestDto;
import com.example.demo.model.dto.request.planet.PlanetUpdateRequestDto;
import com.example.demo.model.dto.response.PlanetResponseDto;
import com.example.demo.service.PlanetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/planet")
public class PlanetController {

    private final PlanetService planetService;

    @PostMapping
    public void create(@RequestBody PlanetCreateRequestDto planetCreateRequestDto) {
        planetService.create(planetCreateRequestDto);
    }

    @PutMapping
    public void update(@RequestBody PlanetUpdateRequestDto planetUpdateRequestDto){
        planetService.update(planetUpdateRequestDto);
    }

    @GetMapping("/{planetId}")
    public PlanetResponseDto getById(@PathVariable("planetId") Long planetId){
        return planetService.getById(planetId);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        planetService.delete(id);
    }
}
