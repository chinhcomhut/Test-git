package com.codegym.wbdlaptop.model;

import javax.persistence.*;

@Entity
@Table(name = "chinh_demo")
public class ChinhDemo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public ChinhDemo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ChinhDemo() {
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
