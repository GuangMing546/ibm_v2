package com.wyu.ibm_v2.service;

import com.wyu.ibm_v2.entity.Teacher;


import java.util.List;

public interface TeacherService {
    public List<Teacher> getTeachers(String teacherJod);
    public String update(Teacher teacher);
    public String insertTeacher(Teacher teacher);
    public String deleteTeacherById(Teacher teacher);

}
