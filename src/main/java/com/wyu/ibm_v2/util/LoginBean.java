package com.wyu.ibm_v2.util;

import java.util.List;
import java.util.Set;

public class LoginBean {
    private String type; //用来接收角色的类型
    private Integer id;
    private String name;
    private String teacherJod;
    private String userName;
    private String password;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public String getTeacherJod() {
        return teacherJod;
    }

    public void setTeacherJod(String teacherJod) {
        this.teacherJod = teacherJod;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
