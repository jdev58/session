package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class AppVM {
    private String name;

    public void setName(String name ){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
