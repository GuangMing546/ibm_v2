package com.wyu.ibm_v2.service;

import com.wyu.ibm_v2.entity.Teacher;

import java.util.Set;

public interface TeacherService {
    public Set<Teacher> getTeachers(String teacherJod);
    public String update(Teacher teacher);
    public String insertTeacher(Teacher teacher);
    public String deleteTeacherById(Teacher teacher);

    public int updateTeacherPassword(Teacher teacher);

}
