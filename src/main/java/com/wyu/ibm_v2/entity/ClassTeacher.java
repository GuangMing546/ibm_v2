package com.wyu.ibm_v2.entity;

public class ClassTeacher {
    private Integer id;
    private String classId;
    private String chineseTeacher;
    private String mathTeacher;
    private String englishTeacher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getChineseTeacher() {
        return chineseTeacher;
    }

    public void setChineseTeacher(String chineseTeacher) {
        this.chineseTeacher = chineseTeacher;
    }

    public String getMathTeacher() {
        return mathTeacher;
    }

    public void setMathTeacher(String mathTeacher) {
        this.mathTeacher = mathTeacher;
    }

    public String getEnglishTeacher() {
        return englishTeacher;
    }

    public void setEnglishTeacher(String englishTeacher) {
        this.englishTeacher = englishTeacher;
    }

    @Override
    public String toString() {
        return "classTeacher{" +
                "id=" + id +
                ", classId='" + classId + '\'' +
                ", chineseTeacher='" + chineseTeacher + '\'' +
                ", mathTeacher='" + mathTeacher + '\'' +
                ", englishTeacher='" + englishTeacher + '\'' +
                '}';
    }
}
