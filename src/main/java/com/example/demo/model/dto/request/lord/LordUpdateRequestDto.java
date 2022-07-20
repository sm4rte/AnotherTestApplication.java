package com.example.demo.model.dto.request.lord;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter

public class LordUpdateRequestDto {

    private Long id;

    private String name;

    private String nick;

    private short age;

    private String email;

    private LocalDateTime dateOfBirth;

    private String phoneNumber;
}



