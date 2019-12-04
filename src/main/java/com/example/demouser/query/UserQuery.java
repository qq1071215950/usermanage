package com.example.demouser.query;

import lombok.Data;

@Data
public class UserQuery {
    private String name;
    private String phone;
    private String email;
    private Integer currPage;
    private Integer pageSize;
}
