package com.wyu.ibm_v2.service.impl;

import com.wyu.ibm_v2.entity.ClassTeacher;
import com.wyu.ibm_v2.entity.Student;
import com.wyu.ibm_v2.mapper.ClassTeacherMapper;
import com.wyu.ibm_v2.mapper.StudentMapper;
import com.wyu.ibm_v2.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper; //用来对student表进行操作
    @Resource
    ClassTeacherMapper classTeacherMapper;

    @Override
    public List<Student> getAllStudentToAdmin() {
        return studentMapper.getAllStudentToAdmin();

    }

    @Override
    public int insertStudentFromAdmin(Student student) {
        return studentMapper.insertStudentFromAdmin(student);
    }

    @Override
    public int updateStudentFromAdmin(Student student) {
        return studentMapper.updateStudentFromAdmin(student);
    }

    @Override
    public int deleteStudentFromAdmin(Integer id) {
        return studentMapper.deleteStudentFromAdmin(id);
    }

    @Override
    public List<Student> getAllStudentToTeacher(String classId) {
        return studentMapper.getAllStudentToTeacher(classId);
    }

    @Override
    public int updateStudentScore(Student student) {
        return studentMapper.updateStudentScore(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public int updateStudentPassword(Student student) {
        return studentMapper.updateStudentPassword(student);
    }
}
