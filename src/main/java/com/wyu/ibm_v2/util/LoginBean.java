package com.wyu.ibm_v2.util;

import java.util.List;
import java.util.Set;

public class LoginBean {
    private String type; //用来接收角色的类型
    private Integer id;
    private String teacherName;
    private String teacherJod;
    private String userName;
    private String password;
    private String teacherId;


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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }


}
