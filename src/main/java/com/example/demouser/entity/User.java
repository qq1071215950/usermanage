package com.example.demouser.entity;

public class User {
    /**
    * 用户id
    */
    private Integer id;

    /**
    * 用户名
    */
    private String name;

    /**
    * 年龄
    */
    private String age;

    /**
    * 地址
    */
    private String address;

    /**
    * 电话
    */
    private String phone;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 标签
    */
    private String tags;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}