package com.wyu.ibm_v2.service;

import com.wyu.ibm_v2.entity.Student;

import java.util.List;
import java.util.Set;

public interface StudentService {
    //Admin用户可以对student表进行的操作
    public List<Student> getAllStudentToAdmin();
    public int insertStudentFromAdmin(Student student);
    public int updateStudentFromAdmin(Student student);
    public int deleteStudentFromAdmin(Integer id);

    //Teacher用户可以对student表进行的操作
    public List<Student> getAllStudentToTeacher(String classId);
    public int updateStudentScore(Student student);

    //student用户可以对student表进行的操作
    public Student getStudentById(Integer id);
    public int updateStudentPassword(Student student);
}
