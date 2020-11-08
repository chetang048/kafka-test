package com.upgrad.kafkatest.entity;


import lombok.Getter;

@Getter

public enum Role {
    ADMIN("admin"),
    STUDENT("student"),
    TA("ta"),
    TEACHER("teacher");

    private String value;

    Role(String value) {
        this.value = value;
    }
}


