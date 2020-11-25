package com.wyu.ibm_v2.entity;

public class Student {
    private Integer id;
    private String studentNumber;
    private String studentName;
    private String studentClass;
    private String chineseScore;
    private String mathScore;
    private String englishScore;
    private String userName;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(String chineseScore) {
        this.chineseScore = chineseScore;
    }

    public String getMathScore() {
        return mathScore;
    }

    public void setMathScore(String mathScore) {
        this.mathScore = mathScore;
    }

    public String getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(String englishScore) {
        this.englishScore = englishScore;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
