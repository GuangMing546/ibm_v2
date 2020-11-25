package com.wyu.ibm_v2.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Teacher {
    private Integer id;
    private String teacherName;
    private String teacherJod;
    private String userName;
    private String password;
    //这个属性是自己加的
    private List<String> classId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getClassId() {
        return classId;
    }

    public void setClassId(List<String> classId) {
        this.classId = classId;
    }


//    public void setTeacherId(String teacherId) {
//        this.teacherId = (this.id).toString();
//    }



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
}
