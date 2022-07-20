package com.example.demo.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "lord")
public class Lord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "nick")
    private String nick;

    @Column(name = "age")
    private short age;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "date_of_birth")
    private Timestamp dateOfBirth;

    @Column(name = "phone_number", unique = true)
    private String phoneNumber;
}
