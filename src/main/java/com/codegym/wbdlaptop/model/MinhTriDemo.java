package com.codegym.wbdlaptop.model;

import javax.persistence.*;

@Entity
@Table(name = "minh_tri")
public class MinhTriDemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    public MinhTriDemo(Long id) {
        this.id = id;
    }

    public MinhTriDemo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
