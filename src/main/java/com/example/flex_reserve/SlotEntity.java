package com.example.flex_reserve;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity public class SlotEntity {

    @Id

    private Long id;
    private String name;
    private String surname;

}