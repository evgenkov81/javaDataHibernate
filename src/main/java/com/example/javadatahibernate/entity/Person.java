package com.example.javadatahibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(PersonId.class)
@Table(name = "persons")
public class Person implements Serializable {
    @Id
    @Column
    private String name;
    @Id
    @Column
    private String surname;
    @Id
    @Column
    private int age;
    @Column (name = "phone_number")
    private int phoneNumber;
    @Column (name = "city_of_living")
    private String cityOfLiving;
}
