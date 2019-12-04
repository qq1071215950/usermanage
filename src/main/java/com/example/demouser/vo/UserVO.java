package com.example.demouser.vo;

import lombok.Data;

import java.util.List;

@Data
public class UserVO<T> {
    private Integer pageSize;
    private Integer currPage;
    private Integer total;
    private List<T> datalist;
}
