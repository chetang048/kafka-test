package com.upgrad.kafkatest.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class ProgressEvent implements Serializable {
    private Long userId;
    private Long gameId;
    private Integer level;
    private Role role;
    private Integer timeSpent;
    private Integer completionPercent;
}

