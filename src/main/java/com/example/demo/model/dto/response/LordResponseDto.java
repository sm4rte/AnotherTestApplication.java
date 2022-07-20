package com.example.demo.model.dto.response;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter

public class LordResponseDto {

    private Long id;

    private String name;

    private String nick;

    private short age;

    private String email;

    private LocalDateTime dateOfBirth;

    private String phoneNumber;
}



