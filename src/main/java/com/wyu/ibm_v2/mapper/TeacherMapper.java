package com.wyu.ibm_v2.mapper;

import com.wyu.ibm_v2.entity.Teacher;

import java.util.List;
import java.util.Set;

public interface TeacherMapper {

    //Admin用户可以对Teacher表进行的操作
    public List<Teacher> getAllTeacher(String teacherJod);
    public int insertTeacher(Teacher teacher);
    public int updateTeacherById(Teacher teacher);
    //删除操作
    public int deleteByTeacherId(Integer id);

    //Teacher用户对teacher表进行的操作
    public int updateTeacherPassword(Teacher teacher);


}
