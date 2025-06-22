package com.Applicant.practice.CoreJava.codeWithVirendra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class MyClass implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    int id;
    String name;
    String address;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public MyClass(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
