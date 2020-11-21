package com.wyu.ibm_v2.util;

import java.util.Set;

public class TeacherResult {

    private String teacherName;
    private String teacherJod;
    private String userName;
    private String password;
    private String teacherId;
    private Set<String> classId;

    public Set<String> getClassId() {
        return classId;
    }

    public void setClassId(Set<String> classId) {
        this.classId = classId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
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
}
