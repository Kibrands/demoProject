package com.kibrands.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Date;

@Data
@EqualsAndHashCode
@Builder
public class User {
    private Integer userId;
    private String userName;
    private String email;
    private String password;
    private Date birth;
}
