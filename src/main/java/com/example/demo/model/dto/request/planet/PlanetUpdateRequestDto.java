package com.example.demo.model.dto.request.planet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlanetUpdateRequestDto {

    private Long id;

    private String name;

    private short age;

    private int area;

    private Long lordId;
}
