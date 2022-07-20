package com.example.demo.converter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ModelMapper {

    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
