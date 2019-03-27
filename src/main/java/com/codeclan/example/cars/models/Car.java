package com.codeclan.example.cars.models;



import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car {

    @Id @GeneratedValue
    private Long id;

    @Column
    private String name;

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
