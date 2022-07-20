package com.example.demo.model.dto.request.planet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlanetCreateRequestDto {

    private String name;

    private int age;

    private int area;

    private Long lordId;
}
