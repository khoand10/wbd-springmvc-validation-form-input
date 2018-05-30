package com.codegym.model;

import javax.validation.constraints.*;

public class User {
    
    @NotBlank(message = "không được để trống tên")
    @Size(min = 2, max = 30,message = "size must to 2 - 30")
    private String name;

    @NotNull(message = "khong duoc de trong")
    @Min(value = 18,message = "tuoi phai lon hon 18")
    
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


